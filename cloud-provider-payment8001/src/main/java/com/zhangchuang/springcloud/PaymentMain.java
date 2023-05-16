package com.zhangchuang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 订单模块主启动类
 *
 * @author: Zhangchuang
 * @create 2023-05-15  14:15
 */
@SpringBootApplication
public class PaymentMain {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain.class, args);
        System.out.println("订单模块启动成功");
    }
}
