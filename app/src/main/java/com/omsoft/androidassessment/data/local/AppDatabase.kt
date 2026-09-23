package com.omsoft.androidassessment.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.omsoft.androidassessment.data.entity.CharacterEntity

@Database(
    entities = [CharacterEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun characterDao(): CharacterDao
}