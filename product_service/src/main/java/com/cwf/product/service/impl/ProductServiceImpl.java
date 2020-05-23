package com.cwf.product.service.impl;

import com.cwf.product.dao.ProductDao;
import com.cwf.product.entity.Product;
import com.cwf.product.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author chenwf
 * @date 2020/5/20
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;
    @Override
    public Product findById(Long id) {
        return productDao.findById(id).get();
    }
}
