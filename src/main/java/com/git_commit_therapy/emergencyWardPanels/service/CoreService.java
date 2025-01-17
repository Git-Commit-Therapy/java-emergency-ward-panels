package com.git_commit_therapy.emergencyWardPanels.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.git_commit_therapy.emergencyWardPanels.model.Message;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

@Log
@Service
public class CoreService {
    //The array with all the active connection
    private final CopyOnWriteArrayList<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final DataRetrievalService dataRetrievalService;

    private Message lastMessage;

    @Autowired
    public CoreService(DataRetrievalService dataRetrievalService) {
        this.dataRetrievalService = dataRetrievalService;
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    @Scheduled(fixedRateString = "${application.core.task.send-data-rate:5000}")
    public void retrieveAndSendData() {
        EmergencyWardServicesOuterClass.QueueStatusResponse inVisiting = dataRetrievalService.getInVisitingStatus();
        EmergencyWardServicesOuterClass.QueueStatusResponse needToBeVisited = dataRetrievalService.getNeedToBeVisitedStatus();
        EmergencyWardServicesOuterClass.LastPatientsCalledResponse lastPatientsCalled = dataRetrievalService.getLastPatientsCalled();
        Message newMessage = new Message();
        try{
            newMessage.setInVisiting((inVisiting != null)?JsonFormat.printer().print(inVisiting) :"{}");
            newMessage.setNeedToBeVisited((needToBeVisited != null)?JsonFormat.printer().print(needToBeVisited) :"{}");
            newMessage.setLastPatientsCalled((lastPatientsCalled != null)?JsonFormat.printer().includingDefaultValueFields().print(lastPatientsCalled) :"[]");

            lastMessage = newMessage;
        }catch (InvalidProtocolBufferException e){
            log.warning("Error while parsing protobuf. Exception: " + e.getMessage());
        }
        sendDataToAllClients();
    }
    @Async
    public void sendDataToAllClients(){
        log.fine("Sending data to all clients");
        if(lastMessage != null || !sessions.isEmpty()){
            try{
                String data =     objectMapper.writeValueAsString(lastMessage);
                sessions.parallelStream().forEach(session -> {
                    if(session.isOpen()){
                        try {
                            session.sendMessage(new TextMessage(data));
                        } catch (IOException e) {
                            log.warning("Error while sending message to "+session.getRemoteAddress()+". Exception: "+  e.getMessage());
                            throw new RuntimeException(e);
                        }
                    }else{
                        try {
                            session.close();
                        } catch (IOException e) {
                            log.warning("Error while closing session with:"+session.getRemoteAddress()+". Exception: "+  e.getMessage());
                        }
                    }
                });
            }catch (JsonProcessingException e){
                log.warning("Error parsing the message: " + e.getMessage());
            }

            log.fine("Completed: sending data to all clients");
        }else{
            log.fine("No messages to send");
        }

    }

    public void addSession(WebSocketSession session) {
        sessions.add(session);
        try {
            String data = objectMapper.writeValueAsString(lastMessage);
            if(session.isOpen()){
                session.sendMessage(new TextMessage(data));
            }
        } catch (IOException e) {
            log.warning("Error while sending message to "+session.getRemoteAddress()+". Exception: "+  e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void removeSession(WebSocketSession session) {
        sessions.remove(session);
    }
}
