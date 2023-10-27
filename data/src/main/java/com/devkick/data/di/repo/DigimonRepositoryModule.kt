package com.devkick.data.di.repo

import com.devkick.data.api.DigimonService
import com.devkick.data.di.domain.DigimonRepo
import com.devkick.data.di.domain.DigimonRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DigimonRepositoryModule {

    @Provides
    @Singleton
    fun provideDigimonRepository(
        digimonService: DigimonService
    ): DigimonRepo {
        return DigimonRepoImpl(digimonService)
    }

}