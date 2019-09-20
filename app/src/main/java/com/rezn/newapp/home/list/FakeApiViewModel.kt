package com.rezn.newapp.home.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rezn.newapp.data.repository.Post
import com.rezn.newapp.data.repository.Repository

class FakeApiViewModel(repository: Repository): ViewModel() {
    val list: MutableLiveData<List<Post>> = MutableLiveData()

    init {
        repository.getInformationList(list)
    }

}