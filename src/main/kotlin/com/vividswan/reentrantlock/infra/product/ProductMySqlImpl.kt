package com.vividswan.reentrantlock.infra.product

import com.vividswan.reentrantlock.domain.product.Product
import com.vividswan.reentrantlock.domain.product.ProductRepository
import jakarta.persistence.EntityNotFoundException
import org.springframework.stereotype.Repository

@Repository
class ProductMySqlImpl(private val jpaRepository: ProductMySqlJpaRepository) : ProductRepository {
    override fun findById(id: Long): Product {
        val productEntity = jpaRepository.findById(id).orElseThrow {
            EntityNotFoundException("Product with id $id not found!")
        }

        return ProductEntity.toDomain(productEntity)
    }

    override fun save(domain: Product): Product {
        val productEntity = jpaRepository.save(ProductEntity.fromDomain(domain))

        return ProductEntity.toDomain(productEntity)
    }

    override fun decreaseStock(id: Long) {
        val productEntity = jpaRepository.findById(id).orElseThrow {
            EntityNotFoundException("Product with id $id not found!")
        }
        if (productEntity.stock <= 0) {
            throw IllegalArgumentException("Product stock is zero!")
        }
        productEntity.stock--;
        jpaRepository.save(productEntity)
    }
}
