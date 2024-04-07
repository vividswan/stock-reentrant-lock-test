package com.vividswan.reentrantlock.controller.product

class CommonResponseDto(val isSuccess: Boolean, val message: String)
class DataResponseDto<T>(val isSuccess: Boolean, val message: String, val data: T)
