package com.devkick.data.model.detail


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class Digimon(
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("name")
    @Expose
    val name: String,
    @SerializedName("xAntibody")
    @Expose
    val xAntibody: Boolean,
    @SerializedName("attributes")
    @Expose
    val attributes: List<Attribute>,
    @SerializedName("descriptions")
    @Expose
    val descriptions: List<Description>,
    @SerializedName("fields")
    @Expose
    val fields: List<Field>,
    @SerializedName("images")
    @Expose
    val images: List<Image>,
    @SerializedName("levels")
    @Expose
    val levels: List<Level>,
    @SerializedName("nextEvolutions")
    @Expose
    val nextEvolutions: List<Evolution>,
    @SerializedName("priorEvolutions")
    @Expose
    val priorEvolutions: List<Evolution>,
    @SerializedName("releaseDate")
    @Expose
    val releaseDate: String,
    @SerializedName("skills")
    @Expose
    val skills: List<Skill>,
    @SerializedName("types")
    @Expose
    val types: List<Type>,
)