package com.andhiratobing.notecompose.feature_note.domain.usecase

data class NoteUseCases(
    val addNotes: AddNoteUseCase,
    val getNotes: GetNotesUseCase,
    val deleteNote: DeleteNoteUseCase,
    val getNoteById: GetNoteByIdUseCase
)