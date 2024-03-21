package com.vividswan.reentrantlock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReentrantLockApplication

fun main(args: Array<String>) {
	runApplication<ReentrantLockApplication>(*args)
}
