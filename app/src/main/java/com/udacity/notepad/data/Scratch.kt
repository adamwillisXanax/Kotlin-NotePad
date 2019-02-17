package com.udacity.notepad.data

fun demoDataClasses()
{

    val note = Note(text = "this is a Note")
    note == note.copy() //this os true

    val aCopy = note.copy(text = "something else...",isPinned = true)


}