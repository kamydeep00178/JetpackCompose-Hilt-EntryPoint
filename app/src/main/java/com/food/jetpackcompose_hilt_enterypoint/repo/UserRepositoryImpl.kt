package com.food.jetpackcompose_hilt_enterypoint.repo

import javax.inject.Inject

class UserRepositoryImpl @Inject constructor() : UserRepository {
    override fun getUser(): String = "Hello User"
}