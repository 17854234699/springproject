package com.csi.order.domain;

import lombok.Data;

import java.math.BigDecimal;

/*
ctrl + alt + o:将没有使用的包进行清除
* **/
@Data
public class Product {

    private Long id ;
    private String productName ;
    private int status ;
    private BigDecimal price ;
    private String product_desc ;
    private String caption ;
    private int inventory ;

}
