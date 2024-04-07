package com.vividswan.reentrantlock.controller.product

import com.vividswan.reentrantlock.domain.product.ProductService
import org.springframework.web.bind.annotation.*

@RequestMapping("/v1/products")
@RestController
class ProductController(private val productService: ProductService) {

    @GetMapping("/{id}")
    fun getProduct(@PathVariable id: Long): ProductDto {
        return productService.getProduct(id)
    }

    @PostMapping("/")
    fun createProduct(): CommonResponseDto {
        productService.createProduct()
        return CommonResponseDto(isSuccess = true, message = "상품 등록 성공")
    }

    @PatchMapping("/{id}/{stock}")
    fun updateProductStock(@PathVariable id: Long, @PathVariable stock: Int): DataResponseDto<ProductDto> {
        val updatedProduct = productService.updateProductStock(id, stock)
        return DataResponseDto(isSuccess = true, message = "재고 등록 성공", updatedProduct)
    }

    @PostMapping("/adjustments")
    fun decreaseProductStock(@RequestBody productDto: ProductDto): CommonResponseDto {
        productService.decreaseProductStock(productDto)
        return CommonResponseDto(isSuccess = true, message = "재고 감소 성공")
    }
}
