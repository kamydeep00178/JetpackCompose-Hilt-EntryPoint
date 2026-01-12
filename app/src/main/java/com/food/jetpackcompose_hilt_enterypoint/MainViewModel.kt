package com.food.jetpackcompose_hilt_enterypoint

import androidx.lifecycle.ViewModel
import com.food.jetpackcompose_hilt_enterypoint.repo.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: UserRepository
) : ViewModel() {
    fun getUser() = repository.getUser()
}