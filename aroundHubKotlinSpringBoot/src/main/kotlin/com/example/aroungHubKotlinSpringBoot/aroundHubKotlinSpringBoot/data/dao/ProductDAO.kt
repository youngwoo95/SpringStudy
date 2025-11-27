package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.dao

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.entity.ProductEntity

interface ProductDAO {
    fun saveProduct(productEntity: ProductEntity) : ProductEntity
    fun getProduct(productId: String) : ProductEntity
}