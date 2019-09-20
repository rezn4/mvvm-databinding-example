package com.rezn.newapp.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import com.bumptech.glide.Glide

object BindingAdapters {
    @BindingAdapter("pl_picture")
    @JvmStatic fun loadImage(view: ImageView, imageUrl: MutableLiveData<String>) {
        Glide.with(view.context)
            .load(imageUrl.value)
            .into(view)
    }



}