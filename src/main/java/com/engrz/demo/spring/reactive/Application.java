package com.engrz.demo.spring.reactive;

import org.springframework.beans.factory.support.DefaultBeanNameGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.engrz.demo.spring.reactive"}, nameGenerator = DefaultBeanNameGenerator.class)
public class Application {

    /**
     * 测试：
     * http://localhost:8080/sse/randomNumbers
     * http://localhost:8080/calculator?operator=add&v1=1&v2=1
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
