package com.rezn.newapp.data.repository

import com.google.gson.annotations.SerializedName

data class PictureAnswer(
    @SerializedName("message")
    var url: String,
    var status: String
)