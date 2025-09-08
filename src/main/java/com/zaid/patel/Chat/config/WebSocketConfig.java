package com.zaid.patel.Chat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat") // Localhost:8080/chat
                .setAllowedOrigins("http://localhost:8080")
                .withSockJS(); // for Compatibility, for people not using SockJs
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic"); // This enables a simple, in-memory message broker that will carry messages back to clients on destinations prefixed with /topic.
        registry.setApplicationDestinationPrefixes("/app"); // This sets the prefix used by clients when sending messages to the application (server).
    }
}
