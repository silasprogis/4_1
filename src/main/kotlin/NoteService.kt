package ru.netology

object NoteService {
    private var notes = mutableListOf<Note>()

    fun add(note: Note): Boolean {
        notes += note
        return true
    }

    fun show() {
        for ((index, storeNote: Note) in notes.withIndex())
            println("номер в массиве $index равно $storeNote")
    }

}