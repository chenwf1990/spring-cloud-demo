package com.cwf.order.service.impl;

import com.cwf.order.service.ProductService;
import com.cwf.order.dao.ProductDao;
import com.cwf.order.entity.Product;
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
