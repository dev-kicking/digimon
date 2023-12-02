package com.devkick.digimon.useCase

import com.devkick.data.model.detail.Digimon
import com.devkick.data.repo.DigimonRepo
import javax.inject.Inject

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 10/27/23
 * @desc
 **/
class GetDigimonUseCase @Inject constructor(
    private val repo: DigimonRepo
) {
    suspend operator fun invoke(id: String): Digimon? = repo.getDigimon(id)
}