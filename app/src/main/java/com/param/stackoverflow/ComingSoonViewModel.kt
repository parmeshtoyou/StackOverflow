package com.param.stackoverflow

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ComingSoonViewModel @Inject constructor(
    val comingSoonRepository: ComingSoonRepository
) : ViewModel() {

    fun getComingSoon() {
        comingSoonRepository.getComingSoon()
    }

}