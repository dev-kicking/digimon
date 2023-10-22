package com.devkick.data.api

import com.devkick.data.model.detail.Digimon
import com.devkick.data.model.list.DigimonList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * @author jacob_kim
 * @email aoqnwnd@naver.com
 * @created 10/22/23
 * @desc
 **/
interface DigimonService {
    @GET("https://www.digi-api.com/api/v1/digimon/{idOrName}")
    suspend fun getDigimon(
        @Path("idOrName") id: String,
    ): Response<Digimon>

    @GET("https://www.digi-api.com/api/v1/digimon")
    suspend fun getDigimonList(
        @Query("name") name: String?,
        @Query("attribute") attribute: String?,
        @Query("xAntibody") xAntibody: Boolean?,
        @Query("level") level: String?,
        @Query("page") page: Int?,
        @Query("pageSize") pageSize: Int?,
    ): Response<DigimonList>
}