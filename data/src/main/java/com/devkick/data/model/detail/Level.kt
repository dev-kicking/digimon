package com.devkick.data.model.detail


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Level(
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("level")
    @Expose
    val level: String
)