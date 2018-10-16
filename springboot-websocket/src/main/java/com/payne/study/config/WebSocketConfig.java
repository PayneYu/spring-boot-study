package com.payne.study.config;

import com.payne.study.handler.MyWebSocketHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * @program: springboot-websocket
 * @description:
 * @author: Huizhe Yu
 * @create: 2018-10-16 12:28
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer{

  @Override
  public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
     registry.addHandler(new MyWebSocketHandler(), "/websocket");
  }
}
