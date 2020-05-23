package com.cwf.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author chenwf
 * @date 2020/5/20
 */
@Data
@Entity(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String product_name;
    private BigDecimal price;
    private Integer status;
    private String product_desc;
    private String caption;
    private Integer inventory;
}
