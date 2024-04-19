package com.vividswan.reentrantlock.domain.product

import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean

@SpringBootTest
class ProductServiceTest {

    @Autowired
    private lateinit var productService: ProductService

    @MockBean
    private lateinit var productRepository: ProductRepository

    @Test
    fun `test reduce stock`() {
        val productId = 1L
        val reduceAmount = 5

        val product = Product(productId, 10)  // 초기 재고 10개

        // Repository 호출 시 돌려줄 가짜 객체 설정
        Mockito.`when`(productRepository.findById(productId)).thenReturn(product)

        // 메서드 실행
        productService.updateProductStock(productId, reduceAmount)

        // 재고 감소 후 상태 확인
        assert(product.stock == 5)  // 10 - 5 = 5가 되어야 함

        // Repository의 save 메서드가 호출되었는지 확인
        Mockito.verify(productRepository).save(product)
    }
}



