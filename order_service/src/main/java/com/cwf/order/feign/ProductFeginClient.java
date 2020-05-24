package com.cwf.order.feign;

import com.cwf.order.entity.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chenwf
 * @date 2020/5/23
 */
@FeignClient(name = "service-product",fallback = ProductFeginClientCallBack.class)
public interface ProductFeginClient {
    @RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
    Product findById(@PathVariable Long id);
}
