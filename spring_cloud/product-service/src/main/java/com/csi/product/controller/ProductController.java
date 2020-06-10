package com.csi.product.controller;

import com.csi.product.domain.Product;
import com.csi.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService ;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {

        /*try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        return productService.findById(id) ;
    }
}
