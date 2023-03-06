package com.example.springioctest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringIocTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIocTestApplication.class, args);

		// 만들어진 빈을 사용하기 위해서...
		ApplicationContext context = ApplicationContextProvider.getContext();

//		Base64Encoder base64Encoder = context.getBean(Base64Encoder.class);
//		UrlEncoder urlEncoder = context.getBean(UrlEncoder.class);

		Encoder encoder = context.getBean(Encoder.class);

		String url = "www.naver.com/books/it?page=10&size=20&name=spring-boot";
		String result = encoder.encode(url);
		System.out.println(result);

//		encoder.setIEncoder(urlEncoder);
//		result = encoder.encode(url);
//		System.out.println(result);

//		Encoder encoder1 = context.getBean("base64Encode", Encoder.class);
//		result = encoder1.encode(url);
//		System.out.println(result);


	}

}

//@Configuration
//class AppConfig {
//
//	@Bean("base64Encode")
//	public Encoder encoder(Base64Encoder base64Encoder) {
//		return new Encoder(base64Encoder);
//	}
//
//	@Bean("urlEncode")
//	public Encoder encoder1(UrlEncoder urlEncoder) {
//		return new Encoder(urlEncoder);
//	}
//}
