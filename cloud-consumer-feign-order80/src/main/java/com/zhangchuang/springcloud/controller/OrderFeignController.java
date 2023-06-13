package com.zhangchuang.springcloud.controller;

import com.zhangchuang.springcloud.entity.CommonResult;
import com.zhangchuang.springcloud.entity.Payment;
import com.zhangchuang.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zhangchuang
 * @create 2023/6/13 20:23
 */
@RestController
@Slf4j
public class OrderFeignController {
    private final PaymentFeignService paymentFeignService;

    public OrderFeignController(PaymentFeignService paymentFeignService) {
        this.paymentFeignService = paymentFeignService;
    }

    /**
     * 通过Feign调用CLOUD-PAYMENT-SERVICE服务的/payment/get/{id}接口
     *
     * @param id id
     * @return CommonResult<Payment>
     */
    @GetMapping("/consumer/payment/get")
    public CommonResult<Payment> getPaymentById(Long id) {
        return paymentFeignService.getPaymentById(id);
    }
}
