package com.csi.product.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name="tb_product")
@Data
public class Product {

    @Id
    private Long id ;
    private String productName ;
    private int status ;
    private BigDecimal price ;
    private String product_desc ;
    private String caption ;
    private int inventory ;

}
