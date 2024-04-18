package com.vividswan.reentrantlock.domain.product

import com.vividswan.reentrantlock.controller.product.ProductDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional
@Service
class ProductService(private val productRepository: ProductRepository) {
    @Transactional(readOnly = true)
    fun getProduct(id: Long): ProductDto {
        val findProduct = productRepository.findById(id)
        return ProductDto.fromDomain(findProduct)
    }

    fun createProduct(): ProductDto {
        val createdProduct = productRepository.createProduct()
        return ProductDto.fromDomain(createdProduct)
    }

    fun updateProductStock(id: Long, stock: Int): ProductDto {
        val findProduct = productRepository.findById(id)
        findProduct.updateStock(stock)
        productRepository.save(findProduct)
        return ProductDto.fromDomain(findProduct)
    }

    fun decreaseProductOneStock(id: Long): Unit {
        val findProduct = productRepository.findById(id)
        findProduct.decreaseOneStock()
        productRepository.save(findProduct)
    }
}
