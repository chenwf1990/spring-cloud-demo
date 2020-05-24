package com.cwf.order.feign;

import com.cwf.order.entity.Product;
import org.springframework.stereotype.Component;

/**
 * @author chenwf
 * @date 2020/5/23
 */
@Component
public class ProductFeginClientCallBack implements ProductFeginClient {
    @Override
    public Product findById(Long id) {
        Product p = new Product();
        p.setProduct_desc("熔断降级");
        return p;
    }
}
