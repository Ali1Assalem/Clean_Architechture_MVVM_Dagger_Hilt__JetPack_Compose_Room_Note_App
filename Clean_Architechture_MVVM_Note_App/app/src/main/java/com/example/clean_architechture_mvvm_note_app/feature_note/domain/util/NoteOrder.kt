package com.example.clean_architechture_mvvm_note_app.feature_note.domain.util

sealed class NoteOrder (val orderType: OrderType) {
    class Title(orderType: OrderType) : NoteOrder(orderType)
    class Date(orderType: OrderType) : NoteOrder(orderType)
    class Color(orderType: OrderType) : NoteOrder(orderType)

    fun copy(orderType: OrderType) : NoteOrder {
        return when(this) {
            is Title -> Title(orderType)
            is Date -> Title(orderType)
            is Color -> Title(orderType)
        }
    }
}
