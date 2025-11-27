package com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.service;

import com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.dto.ProductDto;

public interface ProductService {

    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDto getProduct(String productId);
}
