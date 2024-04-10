package com.vividswan.reentrantlock.infra.product

import com.vividswan.reentrantlock.domain.product.Product
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class ProductEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    var stock: Int = 0
) {
    companion object {
        fun toDomain(entity: ProductEntity): Product {
            return Product(id = entity.id, stock = entity.stock)
        }

        fun fromDomain(domain: Product): ProductEntity {
            return ProductEntity(id = domain.id, stock = domain.stock)
        }
    }
}
