package com.food.jetpackcompose_hilt_enterypoint.di

import com.food.jetpackcompose_hilt_enterypoint.repo.UserRepository
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@EntryPoint
@InstallIn(SingletonComponent::class)
interface UserRepositoryEntryPoint {
    fun userRepository(): UserRepository
}