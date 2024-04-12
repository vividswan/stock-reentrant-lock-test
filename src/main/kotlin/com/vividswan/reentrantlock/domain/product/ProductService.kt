package com.vividswan.reentrantlock.domain.product

import com.vividswan.reentrantlock.controller.product.ProductDto
import org.springframework.stereotype.Service

@Service
class ProductService(private val productRepository: ProductRepository) {
    fun getProduct(id: Long): ProductDto {
        val findProduct = productRepository.findById(id);
        return ProductDto.fromDomain(findProduct)
    }

    fun createProduct(): ProductDto {
        val createdProduct = productRepository.createProduct()
        return ProductDto.fromDomain(createdProduct)
    }

    fun updateProductStock(id: Long, stock: Int): ProductDto {
        // TODO: 인프라단 로직 등록 필요
        return ProductDto(0, 0)
    }

    fun decreaseProductStock(productDto: ProductDto): Unit {
        productRepository.decreaseStock(productDto.id)
    }
}
