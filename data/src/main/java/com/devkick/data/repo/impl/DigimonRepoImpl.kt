package com.devkick.data.repo.impl

import com.devkick.data.source.network.DigimonService
import com.devkick.data.model.detail.Digimon
import com.devkick.data.model.list.DigimonList
import com.devkick.data.repo.DigimonRepo

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 10/22/23
 * @desc
 **/
class DigimonRepoImpl(
    private val digimonService: DigimonService,
): DigimonRepo {
    override suspend fun getDigimon(idOrName: String): Digimon? {
        val result = digimonService.getDigimon(idOrName)

        return result.body()
    }

    override suspend fun getDigimonList(
        name: String?,
        attribute: String?,
        xAntibody: Boolean?,
        level: String?,
        page: Int?,
        pageSize: Int?,
    ): DigimonList? {
        val result =
           digimonService.getDigimonList(
                name,
                attribute,
                xAntibody,
                level,
                page,
                pageSize
            )

        return result.body()
    }
}