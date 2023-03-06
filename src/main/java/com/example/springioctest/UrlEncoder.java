package com.example.springioctest;

import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// @Component 빈으로 만들어, Spring 니가 관리를 해.
@Component
public class UrlEncoder implements IEncoder{
    public String encode(String message) {
        try {
            return URLEncoder.encode(message, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
