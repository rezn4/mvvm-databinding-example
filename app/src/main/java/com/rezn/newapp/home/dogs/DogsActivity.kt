package com.rezn.newapp.home.dogs

import android.os.Bundle
import com.rezn.newapp.R
import com.rezn.newapp.base.BaseActivity
import com.rezn.newapp.databinding.ActivityDogsBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class DogsActivity : BaseActivity<ActivityDogsBinding>() {
    private val dogsViewModel: DogsViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding.viewModel = dogsViewModel
        mBinding.lifecycleOwner = this
    }

    override fun getActivityLayout(): Int {
        return R.layout.activity_dogs
    }
}
