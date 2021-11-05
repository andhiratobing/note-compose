package com.andhiratobing.notecompose.feature_note.domain.usecase

import com.andhiratobing.notecompose.feature_note.domain.model.Note
import com.andhiratobing.notecompose.feature_note.domain.repository.NoteRepository
import com.andhiratobing.notecompose.feature_note.domain.utils.InvalidException

class AddNoteUseCase(
    private val noteRepository: NoteRepository
) {

    @Throws(InvalidException::class)
    suspend operator fun invoke(note: Note) {
        when {
            note.title.isBlank() -> throw InvalidException("The title of the note can't be empty")
            note.content.isBlank() -> throw InvalidException("The content of the note can't be empty")
            else -> noteRepository.insertNote(note)
        }
    }
}