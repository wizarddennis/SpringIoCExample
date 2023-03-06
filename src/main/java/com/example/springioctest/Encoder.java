package com.example.springioctest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Encoder {
    //Encoder 입장에서는 IEncoder를 외부에서 주입을 받았기 때문에, DI를 받은 것이다.
    //즉, 의존을 가지고 있는 애를 주입 받았다.
    private IEncoder iEncoder;

    public Encoder(@Qualifier("base64Encoder") IEncoder iEncoder) {
        this.iEncoder = iEncoder;
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }

//    public void setIEncoder(IEncoder iEncoder) {
//        this.iEncoder = iEncoder;
//    }
}

