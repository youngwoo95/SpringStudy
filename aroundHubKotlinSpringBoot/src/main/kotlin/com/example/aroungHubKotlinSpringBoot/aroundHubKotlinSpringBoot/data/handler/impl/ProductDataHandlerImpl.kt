package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.handler.impl

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.dao.ProductDAO
import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.entity.ProductEntity
import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.handler.ProductDataHandler
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class ProductDataHandlerImpl(
    var productDAO : ProductDAO
) : ProductDataHandler{
    override fun saveProductEntity(
        productId: String,
        productName: String,
        productPrice: Int,
        productStock: Int
    ): ProductEntity {
        val productEntity = ProductEntity(
            productId = productId,
            productName = productName,
            productPrice = productPrice,
            productStock = productStock
        )
        return productDAO.saveProduct(productEntity)
    }

    override fun getProductEntity(productId: String): ProductEntity {
        return productDAO.getProduct(productId)
    }
}