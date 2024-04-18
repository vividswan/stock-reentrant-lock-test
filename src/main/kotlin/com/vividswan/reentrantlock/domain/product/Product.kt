package com.vividswan.reentrantlock.domain.product

class Product(val id: Long?, var stock: Int) {
    fun updateStock(stock: Int) {
        if (stock < 0) {
            throw throw IllegalArgumentException("invalid stock")
        }
        this.stock = stock
    }

    fun decreaseOneStock() {
        if (this.stock <= 0) {
            throw IllegalArgumentException("insufficient stock")
        }
        this.stock -= 1
    }
}
