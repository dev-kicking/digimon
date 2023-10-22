package com.devkick.data.model.detail


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Type(
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("type")
    @Expose
    val type: String
)