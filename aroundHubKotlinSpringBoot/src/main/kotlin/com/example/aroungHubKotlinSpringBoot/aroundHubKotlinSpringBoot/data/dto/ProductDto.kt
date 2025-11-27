package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.dto

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.entity.ProductEntity
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull

class ProductDto(

    @NotNull
    var productId: String? = null,

    @NotNull
    var productName: String? = null,

    @NotNull
    @Min(value = 500)
    @Max(value = 3000000)
    var productPrice: Int? = null,

    @NotNull
    @Min(value = 0)
    @Max(value = 9999)
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