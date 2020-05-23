package com.cwf.product.service;

import com.cwf.product.entity.Product;

/**
 * @author chenwf
 * @date 2020/5/20
 */
public interface ProductService {

    Product findById(Long id);
}
