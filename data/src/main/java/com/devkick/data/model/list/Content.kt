package com.devkick.data.model.list


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Content(
    @SerializedName("href")
    @Expose
    val href: String,
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("image")
    @Expose
    val image: String,
    @SerializedName("name")
    @Expose
    val name: String
)