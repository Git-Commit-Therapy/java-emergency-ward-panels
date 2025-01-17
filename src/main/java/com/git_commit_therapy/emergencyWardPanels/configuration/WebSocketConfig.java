package com.git_commit_therapy.emergencyWardPanels.configuration;

import com.git_commit_therapy.emergencyWardPanels.websocket.WebSocketManager;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    private final WebSocketManager webSocketManager;

    public WebSocketConfig(WebSocketManager webSocketManager) {
        this.webSocketManager = webSocketManager;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(webSocketManager, "/panels-data")
                .setAllowedOrigins("*");
    }
}