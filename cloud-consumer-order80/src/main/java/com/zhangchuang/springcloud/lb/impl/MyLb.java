package com.zhangchuang.springcloud.lb.impl;

import com.zhangchuang.springcloud.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Zhangchuang
 * @create 2023/6/12 20:21
 */
@Component
public class MyLb implements LoadBalancer {

    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    /**
     * 获取并增加
     *
     * @return next
     */
    public final int getAndIncrement() {
        int current;
        int next;

        do {
            current = this.atomicInteger.get();
            next = current >= 2147836 ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current, next));
        System.out.println("第几次访问,次数next:" + next);
        return next;
    }

    @Override
    public ServiceInstance instance(List<ServiceInstance> serviceInstances) {
        int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
