package com.zhangchuang.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Zhangchuang
 * @create 2023/6/3 21:34
 */
@RestController
@Slf4j
public class OrderZKController {

    public static final String INVOKE_URL = "http://cloud-provider-payment";

    private final RestTemplate restTemplate;

    public OrderZKController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * <a href="http://localhost/consumer/payment/zk">...</a>
     *
     * @return String
     */
    @GetMapping("/consumer/payment/zk")
    public String paymentInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }
}
