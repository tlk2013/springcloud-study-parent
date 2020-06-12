package com.dwsoft.springcloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tlk
 * @date 2020/6/8-11:28
 */
@EnableEurekaServer    // 启用 Eureka 服务器功能
@SpringBootApplication
public class EurekaMainStudy {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMainStudy.class,args);
    }
}
