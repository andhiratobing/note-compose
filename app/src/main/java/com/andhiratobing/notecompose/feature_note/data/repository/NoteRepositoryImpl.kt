package com.andhiratobing.notecompose.feature_note.data.repository

import com.andhiratobing.notecompose.feature_note.data.datasource.NoteDao
import com.andhiratobing.notecompose.feature_note.domain.model.Note
import com.andhiratobing.notecompose.feature_note.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow

class NoteRepositoryImpl(
    private val noteDao: NoteDao
) : NoteRepository {


    override fun getNotes(): Flow<List<Note>> {
        return noteDao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return noteDao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return noteDao.insertNotes(note)
    }

    override suspend fun deleteNote(note: Note) {
        return noteDao.deleteNotes(note)
    }
}