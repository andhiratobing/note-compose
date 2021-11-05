package com.andhiratobing.notecompose.feature_note.data.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.andhiratobing.notecompose.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1,
    exportSchema = false
)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao

    companion object{
        const val DATABASE_NAME = "notes_database"
    }
}