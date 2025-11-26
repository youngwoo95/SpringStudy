package com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.repository;

import com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
