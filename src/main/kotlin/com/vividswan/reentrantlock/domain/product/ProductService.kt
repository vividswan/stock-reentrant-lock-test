package com.vividswan.reentrantlock.domain.product

import com.vividswan.reentrantlock.controller.product.CommonResponseDto
import com.vividswan.reentrantlock.controller.product.ProductDto
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

class ProductService {
    fun getProduct(@PathVariable id: Long): ProductDto {
        // TODO: 인프라단 로직 등록 필요
        return ProductDto(0, 0)
    }

    fun createProduct(): CommonResponseDto {
        // TODO: 인프라단 로직 등록 필요
        return CommonResponseDto(isSuccess = true, message = "상품 등록 성공")
    }

    fun setProductStock(@PathVariable id: Long, @PathVariable stock: Int): CommonResponseDto {
        // TODO: 서비스단 로직 등록 필요
        return CommonResponseDto(isSuccess = true, message = "재고 등록 성공")
    }

    fun decreaseProductStock(@RequestBody productDto: ProductDto): CommonResponseDto {
        // TODO: 서비스단 로직 등록 필요
        return CommonResponseDto(isSuccess = true, message = "재고 감소 성공")
    }
}
