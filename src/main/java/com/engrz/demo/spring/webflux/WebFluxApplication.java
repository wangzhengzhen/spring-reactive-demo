package com.engrz.demo.spring.webflux;

import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.engrz.demo.spring.webflux"}, nameGenerator = DefaultBeanNameGenerator.class)
public class WebFluxApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxApplication.class, args);
    }

}
