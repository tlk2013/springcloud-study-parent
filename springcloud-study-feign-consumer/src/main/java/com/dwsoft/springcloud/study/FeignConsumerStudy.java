package com.dwsoft.springcloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author tlk
 * @date 2020/6/8-14:38
 */
@EnableFeignClients
@SpringBootApplication
public class FeignConsumerStudy {
    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerStudy.class,args);
    }
}
