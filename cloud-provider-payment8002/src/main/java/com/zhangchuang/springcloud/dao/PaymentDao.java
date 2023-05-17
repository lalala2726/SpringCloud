package com.zhangchuang.springcloud.dao;

import com.zhangchuang.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Zhangchuang
 * @create 2023-05-15  14:41
 */
@Mapper
public interface PaymentDao {
    /**
     * 创建订单
     *
     * @param payment 订单
     * @return int
     */
    int create(Payment payment);


    /**
     * 根据ID查询订单
     *
     * @param id ID
     * @return 订单
     */
    Payment getPaymentById(@Param("id") Long id);
}
