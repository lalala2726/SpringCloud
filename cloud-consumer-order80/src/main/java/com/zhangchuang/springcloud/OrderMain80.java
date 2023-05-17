package com.zhangchuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 消费者主启动类
 *
 * @author: Zhangchuang
 * @create 2023-05-16  10:12
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
        System.out.println("Order80模块启动成功");
    }

}
