package com.git_commit_therapy.emergencyWardPanels.service;

import com.git_commit_therapy.emergencyWardPanels.security.BearerToken;
import lombok.Getter;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;

import java.util.Map;

@Log
@Service
public class KeycloakTokenService {

    private final RestTemplate restTemplate;

    @Value("${application.keycloak.url}")
    private String keycloakUrl;

    @Value("${application.keycloak.realm}")
    private String realm;

    @Value("${application.keycloak.client-id}")
    private String clientId;

    @Value("${application.keycloak.client-secret}")
    private String clientSecret;

    @Getter
    private String jwtToken;

    @Autowired
    public KeycloakTokenService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Scheduled(fixedRateString = "${keycloak.scheduled.refresh-rate:30000}")
    public void fetchAccessTokenPeriodically() {
        String token = retrieveToken();
        log.info("New jwt token: "+token);
        if(token != null) {
            jwtToken = token;
        }
    }

    private String retrieveToken() {
        String tokenEndpoint = String.format("%s/realms/%s/protocol/openid-connect/token", keycloakUrl, realm);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("grant_type", "client_credentials");
        body.add("client_id", clientId);
        body.add("client_secret", clientSecret);

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(body, headers);

        ResponseEntity<Map> response = restTemplate.postForEntity(tokenEndpoint, request, Map.class);

        Map<String, Object> responseBody = response.getBody();
        return (String) responseBody.get("access_token");
    }

    public BearerToken getBearerToken() {
        return new BearerToken(getJwtToken());
    }
}