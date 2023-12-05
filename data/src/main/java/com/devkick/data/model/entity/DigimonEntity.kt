package com.devkick.data.model.entity

import androidx.annotation.Keep
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.*

@Keep
@Serializable
@Entity(tableName = "categories")
data class DigimonEntity(
    @PrimaryKey(autoGenerate = true)
    var primaryKey: Int = 0,
    @SerialName("id")
    val id: Int,
    @SerialName("image")
    val image: String,
)
