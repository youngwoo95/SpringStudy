package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.repository

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.entity.ProductEntity
import org.springframework.data.jpa.repository.JpaRepository


interface ProductRepository : JpaRepository<ProductEntity, String> {
}