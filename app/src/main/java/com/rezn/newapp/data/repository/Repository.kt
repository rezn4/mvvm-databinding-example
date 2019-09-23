package com.rezn.newapp.data.repository

import androidx.lifecycle.MutableLiveData

interface Repository {
    fun getRandomPicture(value: MutableLiveData<String>)
    fun getInformationList(value: MutableLiveData<List<Post>>)
}