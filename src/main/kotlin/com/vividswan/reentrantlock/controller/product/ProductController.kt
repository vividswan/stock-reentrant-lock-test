package com.vividswan.reentrantlock.controller.product

import org.springframework.web.bind.annotation.*

@RequestMapping("/v1/products")
@RestController
class ProductController {

    @GetMapping("/{id}")
    fun getProduct(@PathVariable id: Long): ProductDto {
        // TODO: 서비스단 로직 등록 필요
        return ProductDto(0, 0)
    }

    @PostMapping("/")
    fun createProduct(): CommonResponseDto {
        // TODO: 서비스단 로직 등록 필요
        return CommonResponseDto(isSuccess = true, message = "상품 등록 성공")
    }

    @PatchMapping("/{id}/{stock}")
    fun setProductStock(@PathVariable id: Long, @PathVariable stock: Int): CommonResponseDto {
        // TODO: 서비스단 로직 등록 필요
        return CommonResponseDto(isSuccess = true, message = "재고 등록 성공")
    }

    @PostMapping("/adjustments")
    fun decreaseProductStock(@RequestBody productDto: ProductDto): CommonResponseDto {
        // TODO: 서비스단 로직 등록 필요
        return CommonResponseDto(isSuccess = true, message = "재고 감소 성공")
    }
}
