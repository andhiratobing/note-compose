package com.andhiratobing.notecompose.feature_note.presentation.notes

import com.andhiratobing.notecompose.feature_note.domain.model.Note
import com.andhiratobing.notecompose.feature_note.domain.utils.NoteOrder
import com.andhiratobing.notecompose.feature_note.domain.utils.OrderType

data class NoteState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
