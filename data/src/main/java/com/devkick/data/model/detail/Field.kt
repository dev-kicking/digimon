package com.devkick.data.model.detail


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Field(
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("field")
    @Expose
    val field: String,
    @SerializedName("image")
    @Expose
    val image: String
)