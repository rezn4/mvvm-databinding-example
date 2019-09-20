package com.rezn.newapp.home.dogs

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rezn.newapp.data.repository.Repository

class DogsViewModel(private val repository: Repository): ViewModel() {
    val url: MutableLiveData<String> = MutableLiveData()

    init {
        showPicture()
    }

    private fun showPicture(){
        repository.getRandomPicture(url)
    }
}