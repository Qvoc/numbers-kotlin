package com.example.numbers_kotlin.repository

import com.example.numbers_kotlin.NumbersApi
import com.example.numbers_kotlin.services.NumbersApiService

class NumbersRepository {
    private val numbersApi: NumbersApiService =
        NumbersApi.createApi()

    fun getRandomNumberTrivia() =
        numbersApi.getRandomNumberTrivia()
}