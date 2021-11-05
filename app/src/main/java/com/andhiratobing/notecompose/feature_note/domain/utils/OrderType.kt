package com.andhiratobing.notecompose.feature_note.domain.utils

sealed class OrderType {

    object Ascending: OrderType()
    object Descending: OrderType()
}
