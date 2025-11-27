package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.dto

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.entity.ProductEntity

class ProductDto(
    var productId: String? = null,
    var productName: String? = null,
    var productPrice: Int? = null,
    var productStock: Int? = null
) {
    fun toEntity() : ProductEntity{
        return ProductEntity(
            productId = productId,
            productName = productName,
            productPrice = productPrice,
            productStock = productStock
        )
    }
}