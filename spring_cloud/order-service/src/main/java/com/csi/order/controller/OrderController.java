package com.csi.order.controller;

import com.csi.order.domain.Product;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
@DefaultProperties(defaultFallback = "fallback4Wait")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate ;

    @HystrixCommand(commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value="4000")
    }
    )

    /**
     * 研究:
     *    1. SpringBoot序列化与反序列化
     *    2. 在SpringBoot中，引入一个javascript、样式文件
     */
    @RequestMapping(value = "/buy/{id}",method = RequestMethod.GET)
    public Product findById(@PathVariable Long id) {
        return restTemplate.getForObject("http://PRODUCT-SERVICE/product/" + id, Product.class) ;
    }

    /**
     * 回退方法的返回值必须与调用者的方法要一致，参数也要完全一致
     * @param
     * @return
     */
    public Product fallback4Wait() {
        Product product = new Product() ;
        product.setProductName("当前服务访问压力过大，请稍后重试！");
        return product ;
    }

}
