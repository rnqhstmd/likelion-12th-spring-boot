package org.mjulikelion.likelion12thspringboot.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello() {
        return "hello, LikeLion!";
    }
}
