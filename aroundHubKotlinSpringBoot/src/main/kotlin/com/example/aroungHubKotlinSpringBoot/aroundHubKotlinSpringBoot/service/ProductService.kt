package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.service

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.dto.ProductDto

interface ProductService {
    fun saveProduct(productId: String, productName : String, productPrice: Int, productStock: Int) : ProductDto

    fun getProduct(productId: String) : ProductDto
}