package com.koin.example.repository

import com.koin.example.api.MyApi
import com.koin.example.interfaces.MainRepository

class MainRepositoryImpl(
    private val api: MyApi
): MainRepository {

    override fun doNetworkCall() {
        api.callApi()
    }
}