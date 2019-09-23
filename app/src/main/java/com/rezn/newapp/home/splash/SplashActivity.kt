package com.rezn.newapp.home.splash

import android.content.Intent
import android.os.Bundle
import com.rezn.newapp.R
import com.rezn.newapp.base.BaseActivity
import com.rezn.newapp.databinding.ActivitySplashBinding
import com.rezn.newapp.home.main.MainActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashActivity: BaseActivity<ActivitySplashBinding>() {
    override fun getActivityLayout(): Int {
        return R.layout.activity_splash
    }

    private val splashViewModel: SplashViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        mBinding.viewModel = splashViewModel
        mBinding.lifecycleOwner = this

        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}