package com.git_commit_therapy.emergencyWardPanels.service;

import com.git_commit_therapy.proto.emergency.EmergencyWardPanelsServiceGrpc;
import com.git_commit_therapy.proto.emergency.EmergencyWardServicesOuterClass;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import jakarta.annotation.PostConstruct;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

@Log
@Service
public class DataRetrievalService {

    @Value("${application.backend.host}")
    private String host;

    @Value("${application.backend.port}")
    private int port;

    @Value("${application.backend.run-over-https}")
    private boolean runOverHttps;

    private final KeycloakTokenService jwtService;

    private ManagedChannel channel;

    @Autowired
    public DataRetrievalService(KeycloakTokenService jwtService) {
        this.jwtService = jwtService;
    }

    @PostConstruct
    public void init() {
        try {
            createManagedChannel();
        } catch (NoSuchAlgorithmException | SSLException | KeyManagementException e) {
            log.severe("Error while creating ManagedChannel" + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private void createManagedChannel() throws NoSuchAlgorithmException, KeyManagementException, SSLException {
        if (runOverHttps) {
            TrustManager[] trustAllCertificates = new TrustManager[]{
                    new X509TrustManager() {
                        public X509Certificate[] getAcceptedIssuers() {
                            return new X509Certificate[0];
                        }

                        public void checkClientTrusted(X509Certificate[] certs, String authType) {
                        }

                        public void checkServerTrusted(X509Certificate[] certs, String authType) {
                        }
                    }
            };

            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustAllCertificates, new java.security.SecureRandom());
            channel = NettyChannelBuilder.forAddress(host, port)
                    .sslContext(io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts.forClient()
                            .trustManager((X509TrustManager) trustAllCertificates[0])
                            .build())
                    .build();
        } else {
            channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        }
    }

    public EmergencyWardServicesOuterClass.QueueStatusResponse getNeedToBeVisitedStatus() {
        try{
            EmergencyWardPanelsServiceGrpc.EmergencyWardPanelsServiceBlockingStub stub = EmergencyWardPanelsServiceGrpc.newBlockingStub(channel)
                .withCallCredentials(jwtService.getBearerToken());
            return stub.retrieveNeedToBeVisitedStatus(Empty.getDefaultInstance());
        }catch (Exception e){
            log.warning("getNeedToBeVisitedStatus exception: " +e.getMessage());
            return null;
        }
    }

    public EmergencyWardServicesOuterClass.QueueStatusResponse getInVisitingStatus() {
        try{
            EmergencyWardPanelsServiceGrpc.EmergencyWardPanelsServiceBlockingStub stub = EmergencyWardPanelsServiceGrpc.newBlockingStub(channel)
                .withCallCredentials(jwtService.getBearerToken());
            return stub.retrieveInVisitingStatus(Empty.getDefaultInstance());
        }catch (Exception e){
            log.warning("getInVisitingStatus exception: " +e.getMessage());
            return null;
        }
    }

    public EmergencyWardServicesOuterClass.LastPatientsCalledResponse getLastPatientsCalled() {
        try{
            EmergencyWardPanelsServiceGrpc.EmergencyWardPanelsServiceBlockingStub stub = EmergencyWardPanelsServiceGrpc.newBlockingStub(channel)
                    .withCallCredentials(jwtService.getBearerToken());
            return stub.retrieveLastPatientsCalled(Empty.getDefaultInstance());
        }catch (Exception e){
            log.warning("getLastPatientsCalled exception: " +e.getMessage());
            return null;
        }
    }

}
