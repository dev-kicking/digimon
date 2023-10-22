package com.devkick.data.di.domain

import android.util.Log
import com.devkick.data.api.DigimonService
import com.devkick.data.model.detail.Digimon
import com.devkick.data.model.list.DigimonList
import com.devkick.data.util.BaseDataSource
import com.devkick.data.util.RemoteResult

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 10/22/23
 * @desc
 **/
class DigimonRepoImpl(
    private val digimonService: DigimonService
): BaseDataSource(), DigimonRepo {
    override suspend fun getDigimon(idOrName: String): RemoteResult<Digimon> {
        val result = getResult { digimonService.getDigimon(idOrName) }

        if (result.status != RemoteResult.Status.SUCCESS) {
            Log.e("deletePet", result.message.toString())
        }

        return result
    }

    override suspend fun getDigimonList(): RemoteResult<DigimonList> {
        TODO("Not yet implemented")
    }
}