package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.handler

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.entity.ProductEntity

interface ProductDataHandler {
    fun saveProductEntity(productId: String, productName: String, productPrice: Int, productStock: Int) : ProductEntity

    fun getProductEntity(productId: String) : ProductEntity
}