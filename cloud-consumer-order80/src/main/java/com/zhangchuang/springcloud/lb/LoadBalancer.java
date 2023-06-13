package com.zhangchuang.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * 手写负载均衡算法
 *
 * @author Zhangchuang
 * @create 2023/6/12 19:58
 */
public interface LoadBalancer {
    /**
     * 获取所有的服务实例
     *
     * @param serviceInstances 服务实例集合
     * @return 服务实例
     */
    ServiceInstance instance(List<ServiceInstance> serviceInstances);
}
