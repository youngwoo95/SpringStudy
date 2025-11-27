package com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.controller

import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.data.dto.ProductDto
import com.example.aroungHubKotlinSpringBoot.aroundHubKotlinSpringBoot.service.ProductService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/product-api")
class ProductController(
    val productService: ProductService,
    val LOGGER: Logger = LoggerFactory.getLogger(ProductController::class.java)
) {

    @GetMapping("/product/{productId}")
    fun getProduct(@PathVariable productId: String) : ProductDto{

        val startTime : Long = System.currentTimeMillis()

        LOGGER.info("[ProductController] perform {} of Aroung Hub API.", "getProduct")

        val productDto = productService.getProduct(productId)

        LOGGER.info(
            "[ProductController] Response :: productId = {}, productName = {}, productPrice = {}, productStock = {}, Response Time = {}ms",
            productDto.productId!!,
            productDto.productName!!,
            productDto.productPrice!!,
            productDto.productStock!!,
            (System.currentTimeMillis() - startTime)
        )

        return productDto
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