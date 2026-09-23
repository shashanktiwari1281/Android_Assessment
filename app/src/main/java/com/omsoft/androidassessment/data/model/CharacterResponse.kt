package com.omsoft.androidassessment.data.model

data class CharacterResponse(
    val results: List<CharacterDto>?
)

data class CharacterDto(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val image: String
)