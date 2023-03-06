package com.example.springioctest;

import org.springframework.stereotype.Component;

import java.util.Base64;

// 스프링에게 객체로 관리해달라고 요청하기 위해서...@Component 를 클래스 위에 달아줌
// 왼쪽에 빈(Bean) 마크가 나옴..
@Component
public class Base64Encoder implements IEncoder{
    @Override
    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
