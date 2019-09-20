package com.rezn.newapp.home.list

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.rezn.newapp.R
import com.rezn.newapp.base.BaseActivity
import com.rezn.newapp.databinding.ActivityListBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlinx.android.synthetic.main.activity_list.*

class FakeApiActivity: BaseActivity<ActivityListBinding>() {


    override fun getActivityLayout(): Int {
        return R.layout.activity_list
    }

    private val fakeApiViewModel: FakeApiViewModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding.viewModel = fakeApiViewModel
        mBinding.lifecycleOwner = this

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        val listAdapter = FakeApiAdapter()
        recyclerView.adapter = listAdapter

        fakeApiViewModel.list.observe(this, Observer {
            listAdapter.setItems(it)
        })

    }
}