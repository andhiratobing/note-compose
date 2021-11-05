package com.andhiratobing.notecompose.feature_note.data.datasource

import androidx.room.*
import com.andhiratobing.notecompose.feature_note.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNotes(note: Note)

    @Delete
    suspend fun deleteNotes(note: Note)

}