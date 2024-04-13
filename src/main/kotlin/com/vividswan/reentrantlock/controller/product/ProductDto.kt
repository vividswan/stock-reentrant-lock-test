package com.vividswan.reentrantlock.controller.product

import com.vividswan.reentrantlock.domain.product.Product

class ProductDto(val id: Long?, var stock: Int) {
    companion object {
        fun fromDomain(entity: Product): ProductDto {
            return ProductDto(entity.id, entity.stock)
        }
    }
}
