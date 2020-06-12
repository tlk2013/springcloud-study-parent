package com.dwsoft.springcloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author tlk
 * @date 2020/6/8-11:28
 */
// 启用 Zuul 代理功能
@EnableZuulProxy
@SpringBootApplication
public class ZuulMainStudy {
    public static void main(String[] args) {
        SpringApplication.run(ZuulMainStudy.class,args);
    }
}
