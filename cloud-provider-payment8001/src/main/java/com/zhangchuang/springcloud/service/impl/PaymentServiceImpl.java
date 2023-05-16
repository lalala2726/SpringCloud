package com.zhangchuang.springcloud.service.impl;

import com.zhangchuang.springcloud.dao.PaymentDao;
import com.zhangchuang.springcloud.entity.Payment;
import com.zhangchuang.springcloud.service.PaymentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author: Zhangchuang
 * @create 2023-05-15  15:02
 */
@Service
@AllArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentDao paymentDao;


    /**
     * 创建订单业务
     *
     * @param payment 订单
     * @return 返沪结果
     */
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }


    /**
     * 根据ID查询订单
     *
     * @param id ID
     * @return 订单
     */
    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
