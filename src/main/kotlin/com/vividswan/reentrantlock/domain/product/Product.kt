package com.vividswan.reentrantlock.domain.product

import java.util.concurrent.locks.ReentrantLock

class Product(val id: Long?, var stock: Int) {
    private val lock = ReentrantLock()
    fun updateStock(stock: Int) {
        if (stock < 0) {
            throw throw IllegalArgumentException("invalid stock")
        }
        this.stock = stock
    }

    fun decreaseOneStock() {
        lock.lock()
        try {
            if (stock <= 0) {
                throw IllegalArgumentException("insufficient stock")
            }
            stock -= 1
        } finally {
            lock.unlock()
        }
    }
}
