package com.devkick.data.model.detail


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Attribute(
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("attribute")
    @Expose
    val attribute: String,
)