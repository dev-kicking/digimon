package com.devkick.data.model.detail


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Evolution(
    @SerializedName("condition")
    @Expose
    val condition: String,
    @SerializedName("digimon")
    @Expose
    val digimon: String,
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("image")
    @Expose
    val image: String,
    @SerializedName("url")
    @Expose
    val url: String
)