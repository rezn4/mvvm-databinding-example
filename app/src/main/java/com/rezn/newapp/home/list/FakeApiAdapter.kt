package com.rezn.newapp.home.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.rezn.newapp.R
import com.rezn.newapp.base.BaseRecyclerAdapter
import com.rezn.newapp.base.BaseViewHolder
import com.rezn.newapp.data.repository.Post
import com.rezn.newapp.databinding.ItemListBinding

class FakeApiAdapter: BaseRecyclerAdapter<ItemListBinding, Post, FakeApiAdapter.ListViewHolder>(){

    override fun getBinding(inflater: LayoutInflater, parent: ViewGroup): ItemListBinding {
        return DataBindingUtil.inflate(inflater, R.layout.item_list, parent, false)
    }

    override fun getViewHolder(binding: ItemListBinding): ListViewHolder {
        return ListViewHolder(binding)
    }

    class ListViewHolder(binding: ItemListBinding) : BaseViewHolder<ItemListBinding, Post>(binding){
        override fun bind(data: Post, position: Int) {
            binding.post = data
        }
    }


}