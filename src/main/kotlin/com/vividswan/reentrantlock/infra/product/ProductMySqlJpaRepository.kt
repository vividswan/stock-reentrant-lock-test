package com.vividswan.reentrantlock.infra.product

import org.springframework.data.jpa.repository.JpaRepository

interface ProductMySqlJpaRepository : JpaRepository<ProductEntity, Long> {
}
