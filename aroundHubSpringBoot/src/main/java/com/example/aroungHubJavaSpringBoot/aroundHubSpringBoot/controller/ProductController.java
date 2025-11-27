package com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.controller;

import com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.dto.ProductDto;
import com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/product-api")
public class ProductController {
    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    private ProductService productService;

    /*
    * Autowired
    *   -> 자동으로 의존성 연결해준다.
    * */
    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    // http://localhost:8080/api/v1/product-api/product/{productId}
    @GetMapping(value = "/product/{productId}")
    public ProductDto getProduct(@PathVariable String productId){

        long startTime = System.currentTimeMillis();
        LOGGER.info("[ProductController] perform {} of Aroung Hub API.", "getProduct");

        ProductDto productDto = productService.getProduct(productId);

        LOGGER.info("[ProductController] Response :: productId = {}, productName = {}, productPrice = {}, productStock = {}, Response Time = {}ms",
                productDto.getProductId(), productDto.getProductName(), productDto.getProductPrice(), productDto.getProductStock(), (System.currentTimeMillis() - startTime));

        return productDto; 
    }

    // http://localhost:8080/api/v1/product-api/product
    @PostMapping("/product")
    public ProductDto createProduct(@RequestBody ProductDto productDto){

        String productId = productDto.getProductId();
        String productName = productDto.getProductName();
        int productPrice = productDto.getProductPrice();
        int productStock = productDto.getProductStock();

        return productService.saveProduct(productId, productName, productPrice, productStock);
    }

    // http://localhost:8080/api/v1/product-api/product/{productId}
    @DeleteMapping("/product/{productId}")
    public ProductDto deleteProduct(@PathVariable String productId){
        return null;
    }

}
