package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.dao.impl

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.dao.ProductDAO
import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.entity.ProductEntity
import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductDAOImpl(
    val productRepository: ProductRepository
) : ProductDAO
{
    override fun saveProduct(productEntity: ProductEntity): ProductEntity {
        productRepository.save(productEntity)
        return productEntity
    }

    override fun getProduct(productId: String): ProductEntity {
        return productRepository.getReferenceById(productId)
    }
}