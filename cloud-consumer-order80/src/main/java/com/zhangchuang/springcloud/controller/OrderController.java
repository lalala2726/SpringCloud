package com.zhangchuang.springcloud.controller;

import com.zhangchuang.springcloud.entity.CommonResult;
import com.zhangchuang.springcloud.entity.Payment;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Zhangchuang
 * @create 2023-05-16  10:31
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
@AllArgsConstructor
public class OrderController {


    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    private final RestTemplate restTemplate;

    /**
     * 创建订单
     *
     * @param payment 订单
     * @return 订单
     */
    @SuppressWarnings("rawtypes")
    @PostMapping("/payment/info")
    public CommonResult create(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/info", payment, CommonResult.class);
    }


    /**
     * 根据ID查询订单
     *
     * @param id 订单ID
     * @return 订单
     */
    @SuppressWarnings("rawtypes")
    @GetMapping("/payment/{id}")
    public CommonResult getPayment(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/" + id, CommonResult.class);
    }

}
