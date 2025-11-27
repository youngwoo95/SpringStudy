package com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.handler;

import com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.entity.ProductEntity;

public interface ProductDataHandler {

    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);

    ProductEntity getProductEntity(String productId);
}
