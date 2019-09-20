package com.rezn.newapp

import android.app.Application
import com.rezn.newapp.di.viewModelSource
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(viewModelSource)
        }
    }
}