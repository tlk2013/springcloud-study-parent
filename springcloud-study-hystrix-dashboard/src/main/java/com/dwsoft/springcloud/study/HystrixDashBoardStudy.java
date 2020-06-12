package com.dwsoft.springcloud.study;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author tlk
 * @date 2020/6/8-14:38
 */
@EnableHystrixDashboard  //启用 Hystrix 仪表盘功能
@SpringBootApplication
public class HystrixDashBoardStudy {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoardStudy.class,args);
    }
}
