package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.service.impl

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.dto.ProductDto
import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.entity.ProductEntity
import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.handler.ProductDataHandler
import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.service.ProductService
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(
    val productDataHandler : ProductDataHandler
): ProductService {
    override fun saveProduct(
        productId: String,
        productName: String,
        productPrice: Int,
        productStock: Int
    ): ProductDto {
        var productEntity : ProductEntity = productDataHandler.saveProductEntity(productId, productName, productPrice, productStock)

        var productDto : ProductDto = ProductDto(productEntity.productId, productEntity.productName, productEntity.productPrice, productEntity.productStock)
        return productDto
    }

    override fun getProduct(productId: String): ProductDto {
        var productEntity: ProductEntity = productDataHandler.getProductEntity(productId)

        var productDto: ProductDto = ProductDto(productEntity.productId, productEntity.productName, productEntity.productPrice, productEntity.productStock)

        return productDto
    }
}