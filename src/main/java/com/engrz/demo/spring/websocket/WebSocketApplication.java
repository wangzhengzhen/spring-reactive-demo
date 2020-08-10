package com.engrz.demo.spring.websocket;

import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.engrz.demo.spring.websocket"}, nameGenerator = DefaultBeanNameGenerator.class)
public class WebSocketApplication implements CommandLineRunner {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(WebSocketApplication.class)
//                .web(WebApplicationType.NONE) // .REACTIVE, .SERVLET
//                .bannerMode(Banner.Mode.OFF)
//                .run(args);

        SpringApplication.run(WebSocketApplication.class, args);
    }

    @Override
    public void run(String... args) {

    }
}
