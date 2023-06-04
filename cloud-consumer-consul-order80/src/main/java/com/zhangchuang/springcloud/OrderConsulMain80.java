package com.zhangchuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Zhangchuang
 * @create 2023/6/4 15:02
 */
@SpringCloudApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class, args);
        System.out.println("消费模块：OrderConsulMain80 启动成功");
    }

}
