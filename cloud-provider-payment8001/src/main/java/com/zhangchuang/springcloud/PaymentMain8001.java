package com.zhangchuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 订单模块主启动类
 *
 * @author: Zhangchuang
 * @create 2023-05-15  14:15
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
        System.out.println("订单模块启动成功");
    }
}
