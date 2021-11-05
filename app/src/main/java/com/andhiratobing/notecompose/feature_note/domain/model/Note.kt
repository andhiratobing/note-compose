package com.andhiratobing.notecompose.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.andhiratobing.notecompose.ui.theme.*

@Entity
data class Note(
    @PrimaryKey
    val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
) {
    companion object {
        val noteColors = listOf(Orange, Gray, Violet, BabyBlue, RedPink)
    }
}
