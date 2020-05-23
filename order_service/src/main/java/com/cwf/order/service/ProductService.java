package com.cwf.order.service;

import com.cwf.order.entity.Product;

/**
 * @author chenwf
 * @date 2020/5/20
 */
public interface ProductService {

    Product findById(Long id);
}
