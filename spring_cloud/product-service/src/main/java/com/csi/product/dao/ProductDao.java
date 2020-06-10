package com.csi.product.dao;

import com.csi.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductDao extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {
}
