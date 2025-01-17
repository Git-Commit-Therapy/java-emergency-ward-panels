package com.git_commit_therapy.emergencyWardPanels.websocket;

import com.git_commit_therapy.emergencyWardPanels.service.CoreService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Objects;

@Log
public class WebSocketManager extends TextWebSocketHandler {

    @Autowired
    private CoreService coreService;

    @Override
    public void afterConnectionEstablished(WebSocketSession session) {
        log.info("Received connection from "+ Objects.requireNonNull(session.getRemoteAddress()).getAddress().getHostAddress());
        coreService.addSession(session);
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message){
        //Nothing to do
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status){
        coreService.removeSession(session);
        log.info("Connection closed from "+ Objects.requireNonNull(session.getRemoteAddress()).getAddress().getHostAddress());
    }

}