package com.vividswan.reentrantlock.infra.product

import com.vividswan.reentrantlock.domain.product.Product
import jakarta.persistence.EntityNotFoundException
import org.springframework.stereotype.Repository

@Repository
class ProductMySqlImpl(private val jpaRepository: ProductMySqlJpaRepository) {
    fun findById(id: Long): Product {
        val productEntity = jpaRepository.findById(id).orElseThrow {
            EntityNotFoundException("Product with id $id not found!")
        }

        return ProductEntity.toDomain(productEntity)
    }
}
