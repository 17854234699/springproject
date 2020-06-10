package com.csi.product.service.impl;

import com.csi.product.dao.ProductDao;
import com.csi.product.domain.Product;
import com.csi.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao ;

    /**
     * 根据id查询一条Product数据
     * @param id
     * @return
     */
    @Override
    public Product findById(Long id) {
        return productDao.findById(id).get() ;
    }
}
