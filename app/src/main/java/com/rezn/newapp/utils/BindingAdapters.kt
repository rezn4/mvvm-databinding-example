package com.rezn.newapp.utils

import android.widget.ImageView
import android.widget.ListAdapter
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.rezn.newapp.R
import com.squareup.picasso.Picasso

object BindingAdapters {
    @BindingAdapter("pl_picture")
    @JvmStatic fun loadImage(view: ImageView, imageUrl: MutableLiveData<String>) {
        Glide.with(view.context)
            .load(imageUrl.value)
            .into(view)
    }



}