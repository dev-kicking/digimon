package com.devkick.digimon.useCase

import com.devkick.data.repo.DigimonRepo
import com.devkick.data.repo.impl.DigimonRepoImpl
import com.devkick.data.source.network.DigimonService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DigimonUseCaseModule {

    @Provides
    @Singleton
    fun provideDigimonRepository(
        digimonService: DigimonService
    ): DigimonRepo {
        return DigimonRepoImpl(digimonService)
    }

    @Provides
    @Singleton
    fun provideGetDigimonUseCase(
        repo: DigimonRepo
    ): GetDigimonUseCase {
        return GetDigimonUseCase(repo)
    }

}