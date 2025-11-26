package com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.dao;

import com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.entity.ProductEntity;

public interface ProductDAO {
    ProductEntity saveProduct(ProductEntity productEntity);
    ProductEntity getProduct(String productId);
}
