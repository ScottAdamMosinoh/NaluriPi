package com.example.naluripi.util

import com.example.naluripi.viewmodel.PiValueViewModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

//koin injector
val viewModelModule = module {
    viewModel { PiValueViewModelImpl() }
}

