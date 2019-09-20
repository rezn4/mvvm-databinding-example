package com.rezn.newapp.data.api

import com.rezn.newapp.data.repository.PictureAnswer
import com.rezn.newapp.data.repository.Post
import retrofit2.Call
import retrofit2.http.GET

interface DogsAPI {
    @GET("breeds/image/random")
    fun getRandomPicture(): Call<PictureAnswer>
}