package com.devkick.data.model.detail


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Image(
    @SerializedName("href")
    @Expose
    val href: String,
    @SerializedName("transparent")
    @Expose
    val transparent: Boolean
)