package com.rezn.newapp.home.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.rezn.newapp.R
import com.rezn.newapp.base.BaseActivity
import com.rezn.newapp.databinding.ActivityMainBinding
import com.rezn.newapp.home.dogs.DogsActivity
import com.rezn.newapp.home.list.FakeApiActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity: BaseActivity<ActivityMainBinding>() {
    override fun getActivityLayout(): Int {
        return R.layout.activity_main
    }

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding.viewModel = mainViewModel
        mBinding.lifecycleOwner = this

    }

    fun onClick(view: View) {
        var intent = Intent()

        when (view.id){
            R.id.dogs_activity_btn -> intent = Intent(this, DogsActivity::class.java)
            R.id.list_activity_btn -> intent = Intent(this, FakeApiActivity::class.java)
        }

        startActivity(intent)
    }
}