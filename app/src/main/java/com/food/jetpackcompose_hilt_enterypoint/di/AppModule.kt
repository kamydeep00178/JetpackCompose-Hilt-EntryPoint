package com.food.jetpackcompose_hilt_enterypoint.di

import com.food.jetpackcompose_hilt_enterypoint.repo.UserRepository
import com.food.jetpackcompose_hilt_enterypoint.repo.UserRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Singleton
    @Provides
    fun provideUserRepository(): UserRepository {
        return UserRepositoryImpl()
    }
}