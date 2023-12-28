package com.koin.example

import android.app.Activity
import android.os.Bundle
import androidx.annotation.RestrictTo
import com.koin.example.api.MyApi
import com.koin.example.viewModel.MainViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.getViewModel
import java.util.ArrayList

class MainKoin : Activity() {

    private val mainViewModel = getViewModel<MainViewModel>()

    // private val api by inject<MyApi>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_koin)

        mainViewModel.doNetworkCall()

    }
}