package com.cwf.product.controller;

import com.cwf.product.entity.Product;
import com.cwf.product.service.ProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author chenwf
 * @date 2020/5/20
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Product findById(@PathVariable Long id, HttpServletRequest request){
        Product product = productService.findById(id);
        product.setProduct_desc(request.getRequestURL().toString());
        return product;
    }
}
