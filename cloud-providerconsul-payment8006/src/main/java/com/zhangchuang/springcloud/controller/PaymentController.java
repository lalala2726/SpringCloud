package com.zhangchuang.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Zhangchuang
 * @create 2023/6/4 14:38
 */

@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String servicePort;


    @RequestMapping(value = "/payment/consul")
    public String paymentConsul() {
        return "springcloud with consul" + servicePort + "\t" + UUID.randomUUID();
    }
}
