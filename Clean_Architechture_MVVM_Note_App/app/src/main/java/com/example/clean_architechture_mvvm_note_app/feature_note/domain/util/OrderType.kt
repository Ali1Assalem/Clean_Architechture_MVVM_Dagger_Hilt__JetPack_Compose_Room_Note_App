package com.example.clean_architechture_mvvm_note_app.feature_note.domain.util

sealed class OrderType {
    object Ascending:OrderType()
    object Descending:OrderType()
}
