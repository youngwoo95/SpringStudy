package com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.dao.impl;

import com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.dao.ProductDAO;
import com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.entity.ProductEntity;
import com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductDAOImpl implements ProductDAO {

    ProductRepository productRepository;

    /*
    * 자동으로 연결시켜 준다.
    * Dependency Injection
    */
    @Autowired
    public ProductDAOImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
        return productEntity;
    }

    @Override
    public ProductEntity getProduct(String productId) {
        ProductEntity productEntity = productRepository.getById(productId);
        return productEntity;
    }
}
