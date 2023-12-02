package com.devkick.data.repo.mapper

import com.devkick.data.model.ListDigimonItem
import com.devkick.data.model.detail.Digimon
import javax.inject.Inject

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 12/2/23
 * @desc
 **/
class DigimonMapper @Inject constructor() {
    fun Digimon.toList(): ListDigimonItem = ListDigimonItem(
        id = id,
        name = name,
        url = images.firstOrNull()?.href
    )
}