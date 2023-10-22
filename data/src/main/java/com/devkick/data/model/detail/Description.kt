package com.devkick.data.model.detail


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Description(
    @SerializedName("origin")
    @Expose
    val origin: String,
    @SerializedName("language")
    @Expose
    val language: String,
    @SerializedName("description")
    @Expose
    val description: String,
)