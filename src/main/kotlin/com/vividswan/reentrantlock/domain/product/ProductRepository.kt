package com.vividswan.reentrantlock.domain.product

interface ProductRepository {
    fun findById(id: Long): Product
    fun save(domain: Product): Product
    fun createProduct(): Product
}
