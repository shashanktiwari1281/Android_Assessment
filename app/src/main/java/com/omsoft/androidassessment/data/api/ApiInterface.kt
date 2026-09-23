package com.omsoft.androidassessment.data.api

import com.omsoft.androidassessment.data.model.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("api/character")
    suspend fun getCharacters(): Response<CharacterResponse>
}