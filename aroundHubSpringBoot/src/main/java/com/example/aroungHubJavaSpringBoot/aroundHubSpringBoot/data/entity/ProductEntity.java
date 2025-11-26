package com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.entity;

import com.example.aroungHubJavaSpringBoot.aroundHubSpringBoot.data.dto.ProductDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product") /* 테이블의 이름 */
public class ProductEntity {

    @Id /* PK */
    String productId;
    String productName;
    Integer productPrice;
    Integer productStock;

    public ProductDto toDto(){
        return ProductDto.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
    }
}
