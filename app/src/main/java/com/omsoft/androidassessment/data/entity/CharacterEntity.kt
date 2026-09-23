package com.omsoft.androidassessment.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.omsoft.androidassessment.data.model.CharacterDto

@Entity(tableName = "characters")
data class CharacterEntity(
    @PrimaryKey val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val image: String
)

fun CharacterEntity.toDto() = CharacterDto(id, name, status, species, image)
fun CharacterDto.toEntity() = CharacterEntity(id, name, status, species, image)
