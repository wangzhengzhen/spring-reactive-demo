package com.engrz.demo.spring.websocket;

import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.engrz.demo.spring.websocket"}, nameGenerator = DefaultBeanNameGenerator.class)
public class WebSocketApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebSocketApplication.class, args);
    }
}
