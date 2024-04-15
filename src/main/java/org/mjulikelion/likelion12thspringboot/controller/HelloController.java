package org.mjulikelion.likelion12thspringboot.controller;

import org.mjulikelion.likelion12thspringboot.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
@RestController
public class HelloController {

    private final HelloService helloService;

    // 생성자 주입
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public String hello() {
        return this.helloService.hello();
    }

}
