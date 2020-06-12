package com.dwsoft.springcloud.study.handler;

import com.dwsoft.springcloud.study.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author tlk
 * @date 2020/6/8-11:07
 */
@RestController
public class HumanResourceHandler {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/get/employee")
    public Employee getEmployeeRemote() {
        // 远程调用方法的主机地址
       String host = "http://localhost:1000";
        // 远程调用方法的具体 URL 地址
        host="http://study-provider";
        String url = "/provider/get/employee/remote";

        return restTemplate.getForObject(host+url,Employee.class);
    }
}
