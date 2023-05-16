package com.zhangchuang.springcloud.controller;

import com.zhangchuang.springcloud.entity.CommonResult;
import com.zhangchuang.springcloud.entity.Payment;
import com.zhangchuang.springcloud.service.PaymentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * @author: Zhangchuang
 * @create 2023-05-15  15:06
 */

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/order")
public class PaymentController {

    private final PaymentService paymentService;


    /**
     * 添加订单信息
     *
     * @param payment 订单信息
     * @return 返回结果
     */
    @PostMapping("/info")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult<>(200, "插入数据库成功!", payment);
        } else {
            return new CommonResult<>(500, "插入数据失败！", null);
        }
    }

    /**
     * 根据ID查询订单信息
     *
     * @param id 订单ID
     * @return 订单
     */
    @GetMapping("/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("查询结果:" + paymentById);
        if (Objects.isNull(paymentById)) {
            return new CommonResult<>(500, "没有此订单为" + id + "信息!", null);
        } else {
            return new CommonResult<>(200, "查询成功！", paymentById);
        }
    }
}
