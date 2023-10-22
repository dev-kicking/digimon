package com.devkick.data.model.list


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class DigimonList(
    @SerializedName("content")
    @Expose
    val content: List<Content>,
    @SerializedName("pageable")
    @Expose
    val pageable: Pageable
)