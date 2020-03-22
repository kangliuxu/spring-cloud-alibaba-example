package com.xkl.learning.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xkl
 * @date 2020/3/22
 * @description
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class NacosComsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosComsumerApplication.class,args);
    }
}
