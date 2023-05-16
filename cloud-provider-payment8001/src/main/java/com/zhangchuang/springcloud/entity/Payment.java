package com.zhangchuang.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 订单实体类
 *
 * @author: Zhangchuang
 * @create 2023-05-15  14:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    /**
     * ID
     */
    private Long id;

    /**
     * 订单号
     */
    private String serial;
}
