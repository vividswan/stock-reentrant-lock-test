package com.vividswan.reentrantlock.infra.product

import org.springframework.stereotype.Repository

@Repository
class ProductMySqlImpl(private val productMySqlJpaRepository: ProductMySqlJpaRepository) {
}
