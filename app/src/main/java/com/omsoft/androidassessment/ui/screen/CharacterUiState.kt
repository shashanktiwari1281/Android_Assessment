package com.omsoft.androidassessment.ui.screen

import com.omsoft.androidassessment.data.model.CharacterDto

sealed interface CharacterUiState {
    object Loading : CharacterUiState
    data class Success(val characters: List<CharacterDto>) : CharacterUiState
    data class Error(val message: String) : CharacterUiState
}