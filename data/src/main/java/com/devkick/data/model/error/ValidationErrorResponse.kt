package com.devkick.data.model.error

class ValidationErrorResponse(
    val code: String,
    val description: String,
    val details: List<Detail>
) {
    data class Detail(
        val loc: List<String>,
        val msg: String,
        val type: String
    )
}
