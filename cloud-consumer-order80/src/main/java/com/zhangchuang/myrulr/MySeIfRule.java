package com.zhangchuang.myrulr;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Zhangchuang
 * @create 2023/6/5 14:37
 */
@Configuration
public class MySeIfRule {

    @Bean
    public IRule myRule() {
        //定义为随机
        return new RandomRule();
    }
}
