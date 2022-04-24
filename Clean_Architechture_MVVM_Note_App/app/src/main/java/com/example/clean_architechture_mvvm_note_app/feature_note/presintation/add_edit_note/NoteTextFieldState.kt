package com.example.clean_architechture_mvvm_note_app.feature_note.presintation.add_edit_note

data class NoteTextFieldState (
    val text:String="",
    val hint:String="",
    val isHintVisible:Boolean =true
)