package com.rezn.newapp.di

import com.rezn.newapp.home.main.MainViewModel
import com.rezn.newapp.home.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

var splashViewModel = module {
    viewModel {
        SplashViewModel()
    }
}

var mainViewModel = module {
    viewModel {
        MainViewModel()
    }
}