package com.example.clean_architechture_mvvm_note_app.feature_note.presintation.util

sealed class Screen (val route:String){
    object NotesScreen:Screen("notes_screen")
    object AddEditNoteScreen:Screen("add_edit_note_screen")
}
