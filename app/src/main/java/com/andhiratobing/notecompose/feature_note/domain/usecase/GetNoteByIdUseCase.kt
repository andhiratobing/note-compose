package com.andhiratobing.notecompose.feature_note.domain.usecase

import com.andhiratobing.notecompose.feature_note.domain.model.Note
import com.andhiratobing.notecompose.feature_note.domain.repository.NoteRepository

class GetNoteByIdUseCase(
    private val noteRepository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return noteRepository.getNoteById(id)
    }
}