package com.hm.digitalsky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class DigitalskyProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalskyProxyApplication.class, args);
	}

}
