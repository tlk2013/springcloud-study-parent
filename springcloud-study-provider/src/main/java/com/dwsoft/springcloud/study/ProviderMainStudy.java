package com.dwsoft.springcloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @author tlk
 * @date 2020/6/8-10:58
 */
@EnableCircuitBreaker
@SpringBootApplication
public class ProviderMainStudy {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMainStudy.class,args);
    }
}
