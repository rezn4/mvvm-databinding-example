package com.rezn.newapp.data.api

import com.rezn.newapp.data.repository.Post
import retrofit2.Call
import retrofit2.http.GET

interface FakeAPI {
    @GET("posts")
    fun getPosts(): Call<List<Post>>
}