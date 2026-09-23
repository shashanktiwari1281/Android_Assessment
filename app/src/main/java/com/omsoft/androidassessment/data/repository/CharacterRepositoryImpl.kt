package com.omsoft.androidassessment.data.repository

import com.omsoft.androidassessment.data.api.ApiInterface
import com.omsoft.androidassessment.data.entity.toDto
import com.omsoft.androidassessment.data.entity.toEntity
import com.omsoft.androidassessment.data.local.CharacterDao
import com.omsoft.androidassessment.data.model.CharacterDto
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val apiInterface: ApiInterface,
    private val dao: CharacterDao
) : CharacterRepository {
    override fun getCachedCharacters(query: String): Flow<List<CharacterDto>> {
        return dao.searchCharacters(query).map { entities ->
            entities.map { it.toDto() }
        }
    }

    override suspend fun refreshCharacters(query: String?): Result<Unit> {
        return try {
            val response = apiInterface.getCharacters()
            if (response.isSuccessful && response.body() != null) {
                val dtos = response.body()?.results ?: emptyList()
                val entities = dtos.map { it.toEntity() }
                dao.insertCharacters(entities)
                Result.success(Unit)
            } else Result.failure(Throwable( response.errorBody()?.string()))
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}