package com.engrz.demo.spring.websocket.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class EchoHandler implements WebSocketHandler, CorsConfigurationSource {

    @Override
    public Mono<Void> handle(final WebSocketSession session) {
        return session.send(
                session.receive()
                        .map(msg -> session.textMessage("ECHO -> " + msg.getPayloadAsText())));
    }

    @Override
    public CorsConfiguration getCorsConfiguration(ServerWebExchange serverWebExchange) {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.addAllowedOrigin("*");
        return configuration;
    }
}
