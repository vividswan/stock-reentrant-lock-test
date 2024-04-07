package com.vividswan.reentrantlock.domain.product

import com.vividswan.reentrantlock.controller.product.ProductDto
import org.springframework.stereotype.Service

@Service
class ProductService {
    fun getProduct(id: Long): ProductDto {
        // TODO: 인프라단 로직 등록 필요
        return ProductDto(0, 0)
    }

    fun createProduct() {
        // TODO: 인프라단 로직 등록 필요
    }

    fun updateProductStock(id: Long, stock: Int): ProductDto {
        // TODO: 인프라단 로직 등록 필요
        return ProductDto(0, 0)
    }

    fun decreaseProductStock(productDto: ProductDto) {
        // TODO: 인프라단 로직 등록 필요
    }
}
