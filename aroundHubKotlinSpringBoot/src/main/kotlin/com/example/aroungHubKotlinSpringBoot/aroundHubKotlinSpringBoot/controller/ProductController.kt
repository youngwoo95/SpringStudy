package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.controller

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.dto.ProductDto
import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.service.ProductService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/product-api")
class ProductController(
    val productService: ProductService
) {

    @GetMapping("/product/{productId}")
    fun getProduct(@PathVariable productId: String) : ProductDto{
        return productService.getProduct(productId)
    }

    @PostMapping("/product")
    fun createProduct(@RequestBody productDto: ProductDto) : ProductDto{
        val productId: String = productDto.productId!!
        val productName: String = productDto.productName!!
        val productPrice: Int = productDto.productPrice!!
        val productStock: Int = productDto.productStock!!

        return productService.saveProduct(productId, productName, productPrice, productStock)
    }

    @DeleteMapping("/product/{productId}")
    fun deleteProduct(@PathVariable productId: String?): ProductDto? {
        return null
    }


}