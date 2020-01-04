package com.example.numbers_kotlin.services

import com.example.numbers_kotlin.Trivia
import retrofit2.Call
import retrofit2.http.GET

public interface NumbersApiService {
    @GET("/random/trivia?json")
    fun getRandomNumberTrivia(): Call<Trivia>
}