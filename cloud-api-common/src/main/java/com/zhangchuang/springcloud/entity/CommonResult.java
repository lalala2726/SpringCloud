package com.zhangchuang.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通过封装返回
 *
 * @author: Zhangchuang
 * @create 2023-05-15  14:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;


    /**
     * 返回通用JSON字符
     *
     * @param code    状态码
     * @param message 信息
     */
    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

}
