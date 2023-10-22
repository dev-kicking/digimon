package com.devkick.data.model.detail


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Skill(
    @SerializedName("description")
    @Expose
    val description: String,
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("skill")
    @Expose
    val skill: String,
    @SerializedName("translation")
    @Expose
    val translation: String
)