package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.entity

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.dto.ProductDto
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "product")
class ProductEntity(

    @Id /* PK */
    var productId: String? = null,
    var productName: String? = null,
    var productPrice: Int? = null,
    var productStock: Int? = null
)
{
    fun toDto(): ProductDto{
        return ProductDto(
            productId = productId,
            productName = productName,
            productPrice = productPrice,
            productStock = productStock
        )
    }
}