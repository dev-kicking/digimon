package com.devkick.data.model

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 12/6/23
 * @desc
 **/
data class DigimonDetail(
    val id: Int,
    val name: String,
    val image: List<String>,
    val description: String,
    val skills: List<Skill>,
    val priorEvolutions: List<Evolution>,
    val nextEvolutions: List<Evolution>,
) {
    data class Skill(
        val id: Int,
        val skillName: String,
        val description: String
    )

    data class Evolution(
        val id: Int,
        val digimonName: String,
        val image: String,
    )
}
