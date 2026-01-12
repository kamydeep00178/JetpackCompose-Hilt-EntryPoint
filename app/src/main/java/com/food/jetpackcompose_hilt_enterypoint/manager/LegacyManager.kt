package com.food.jetpackcompose_hilt_enterypoint.manager

import android.content.Context
import com.food.jetpackcompose_hilt_enterypoint.di.UserRepositoryEntryPoint
import dagger.hilt.android.EntryPointAccessors

class LegacyManager(private val context: Context) {

    fun fetchUser(): String {
        val entryPoint = EntryPointAccessors.fromApplication(
            context.applicationContext,
            UserRepositoryEntryPoint::class.java
        )
        return entryPoint.userRepository().getUser()
    }
}