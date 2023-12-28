package com.koin.example.api

import retrofit2.http.GET

interface MyApi {
    @GET("my/endpoint")
    fun callApi()
}