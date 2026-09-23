package com.omsoft.androidassessment.di

import com.omsoft.androidassessment.data.api.ApiInterface
import com.omsoft.androidassessment.data.local.CharacterDao
import com.omsoft.androidassessment.data.repository.CharacterRepository
import com.omsoft.androidassessment.data.repository.CharacterRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provide(
        apiInterface: ApiInterface,
        dao: CharacterDao
    ): CharacterRepository {
        return CharacterRepositoryImpl(apiInterface, dao)
    }

}