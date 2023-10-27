package com.devkick.data.useCase

import com.devkick.data.api.DigimonService
import com.devkick.data.model.detail.Digimon
import retrofit2.Response
import javax.inject.Inject

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 10/27/23
 * @desc
 **/
class GetDigimonUseCase @Inject constructor(
    private val repo: DigimonService
) {
    suspend operator fun invoke(id: String): Response<Digimon> = repo.getDigimon(id)
}