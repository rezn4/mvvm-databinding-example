package com.rezn.newapp.data.repository

import androidx.lifecycle.MutableLiveData
import app.dirtyfans.base.SingleLiveEvent

interface Repository {
    fun getRandomPicture(value: MutableLiveData<String>)
    fun getInformationList(value: MutableLiveData<List<Post>>)
}