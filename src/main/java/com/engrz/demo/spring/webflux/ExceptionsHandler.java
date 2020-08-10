package com.engrz.demo.spring.webflux;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import reactor.core.publisher.Mono;

@ControllerAdvice
public class ExceptionsHandler {

    /**
     * 统一异常处理
     * @param exception
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Mono<String> genericExceptionHnadler(Exception exception) {

        return Mono.just("error! ");
    }

}
