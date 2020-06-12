package com.dwsoft.springcloud.study.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author tlk
 * @date 2020/6/8-11:06
 */
@Configuration
public class AtguiguCloudConfig {
    @Bean
    @LoadBalanced//如果需要使用服务名称  这玩意的配置
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
