package com.rezn.newapp.di

import com.rezn.newapp.utils.Const
import com.rezn.newapp.data.api.DogsAPI
import com.rezn.newapp.data.api.FakeAPI
import com.rezn.newapp.data.repository.RepositoryImpl
import com.rezn.newapp.home.dogs.DogsViewModel
import com.rezn.newapp.home.list.FakeApiViewModel
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

var viewModelSource : Module = module {
    viewModel {
        FakeApiViewModel(RepositoryImpl(get(), get()))
    }

    viewModel {
        DogsViewModel(RepositoryImpl(get(), get()))
    }

    single {
        provideRetrofitDogsInstance(provideOkHttpClient())
    }

    single {
        provideRetrofitListInstance(provideOkHttpClient())
    }
}


fun provideOkHttpClient(): OkHttpClient {
    return OkHttpClient.Builder().build()
}

fun provideRetrofitDogsInstance(client: OkHttpClient): DogsAPI {
    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl(Const.BASE_URL_DOGS_API)
        .build()

    return retrofit.create(DogsAPI::class.java)
}

fun provideRetrofitListInstance(client: OkHttpClient): FakeAPI {
    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .baseUrl(Const.BASE_URL_FAKE_API)
        .build()

    return retrofit.create(FakeAPI::class.java)
}