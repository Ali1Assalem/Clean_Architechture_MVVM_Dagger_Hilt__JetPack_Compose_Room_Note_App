package com.example.clean_architechture_mvvm_note_app.feature_note.presintation.notes

import com.example.clean_architechture_mvvm_note_app.feature_note.domain.model.Note
import com.example.clean_architechture_mvvm_note_app.feature_note.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder):NotesEvent()
    data class DeleteNote(val note:Note):NotesEvent()
    object RestoreNote:NotesEvent()
    object ToggleOrderSection: NotesEvent()
}
