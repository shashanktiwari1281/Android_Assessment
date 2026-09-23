package com.omsoft.androidassessment.data.repository

import com.omsoft.androidassessment.data.model.CharacterDto
import kotlinx.coroutines.flow.Flow

interface CharacterRepository {
    fun getCachedCharacters(query: String): Flow<List<CharacterDto>>
    suspend fun refreshCharacters(query: String?): Result<Unit>
}