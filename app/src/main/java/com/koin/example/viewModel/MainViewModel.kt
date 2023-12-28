package com.koin.example.viewModel

import androidx.lifecycle.ViewModel
import com.koin.example.interfaces.MainRepository

class MainViewModel(
    private val repository: MainRepository
) : ViewModel() {
    fun doNetworkCall() {
        repository.doNetworkCall()
    }
}