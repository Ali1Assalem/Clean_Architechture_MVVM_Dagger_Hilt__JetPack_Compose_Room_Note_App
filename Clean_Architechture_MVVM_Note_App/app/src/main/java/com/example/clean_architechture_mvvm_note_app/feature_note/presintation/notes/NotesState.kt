package com.example.clean_architechture_mvvm_note_app.feature_note.presintation.notes

import com.example.clean_architechture_mvvm_note_app.feature_note.domain.model.Note
import com.example.clean_architechture_mvvm_note_app.feature_note.domain.util.NoteOrder
import com.example.clean_architechture_mvvm_note_app.feature_note.domain.util.OrderType

data class NotesState(
    val notes:List<Note> = emptyList(),
    val noteOrder:NoteOrder=NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible:Boolean=false
)
