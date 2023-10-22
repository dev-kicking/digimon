package com.devkick.data.model.list


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Pageable(
    @SerializedName("currentPage")
    @Expose
    val currentPage: Int,
    @SerializedName("elementsOnPage")
    @Expose
    val elementsOnPage: Int,
    @SerializedName("nextPage")
    @Expose
    val nextPage: String,
    @SerializedName("previousPage")
    @Expose
    val previousPage: String,
    @SerializedName("totalElements")
    @Expose
    val totalElements: Int,
    @SerializedName("totalPages")
    @Expose
    val totalPages: Int
)