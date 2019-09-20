package com.rezn.newapp.data.repository

import androidx.lifecycle.MutableLiveData
import com.rezn.newapp.data.api.DogsAPI
import com.rezn.newapp.data.api.FakeAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RepositoryImpl (private val dogsApi: DogsAPI, private val fakeApi: FakeAPI) : Repository {


    override fun getInformationList(value: MutableLiveData<List<Post>>) {
        fakeApi.getPosts().enqueue(object: Callback<List<Post>>{
            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                t.printStackTrace()
            }

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                val listInfo = response.body()
                value.postValue(listInfo)
            }
        })
    }

    override fun getRandomPicture(value: MutableLiveData<String>) {
        dogsApi.getRandomPicture().enqueue(object: Callback<PictureAnswer>{
            override fun onFailure(call: Call<PictureAnswer>, t: Throwable) {
                t.printStackTrace()
            }

            override fun onResponse(call: Call<PictureAnswer>, response: Response<PictureAnswer>) {
                val dogPicture = response.body()
                value.postValue(dogPicture?.url)
            }
        })
    }
}