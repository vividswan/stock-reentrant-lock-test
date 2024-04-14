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
        val findProduct = productRepository.findById(id);
        findProduct.stock = stock
        productRepository.save(findProduct)
        return ProductDto.fromDomain(findProduct)
    }

    fun decreaseProductStock(id: Long): Unit {
        productRepository.decreaseStock(id)
    }
}
