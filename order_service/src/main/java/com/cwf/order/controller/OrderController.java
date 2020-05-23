package com.cwf.order.controller;

import com.cwf.order.entity.Product;
import com.cwf.order.service.ProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author chenwf
 * @date 2020/5/20
 */
@RestController
@RequestMapping("/product")
public class OrderController {
    @Resource
    private ProductService productService;
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Product findById(@PathVariable Long id, HttpServletRequest request){
//        Product product = productService.findById(id);
        Product product = restTemplate.getForObject("http://service-product/product/"+id,Product.class);
//        Product product = restTemplate.getForObject("http://service-product/product/"+id,Product.class);
        return product;
    }
}
