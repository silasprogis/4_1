package ru.netology

object NoteService: CrudService<Note, NoteComment> {

    private var notes = mutableListOf<Note>()
    private var noteComments = mutableListOf<NoteComment>()

    override fun add(note: Note): Note {
        notes.add(note)
        return notes.last()
    }

    override fun show() {
        for ((index, storeNote: Note) in notes.withIndex())
            println("номер в массиве $index равно $storeNote")
    }

    override fun update(note: Note): Boolean {
        var result = false
        for ((index, storeNote: Note) in notes.withIndex())
            if (note.noteId == storeNote.noteId) {
                notes[index] = note.copy(title = storeNote.title, text = storeNote.text)
                result = true
            }
        return result
    }

    override fun createComment(noteComment: NoteComment): NoteComment {
        var result = false
        for (note: Note in notes)
            if (note.noteId == noteComment.noteCommentId) {
                noteComments.add(noteComment)
                result = true
            }
        if (!result) throw PostNotFoundException("No Note Found")
        return noteComments.last()
    }
    fun deleteNote(id: Int): Boolean {
        var result = false
        for (note: Note in notes)
            if (id == note.noteId) {
                note.isDeleted = true
                result = true
            }
        if (!result) throw PostNotFoundException("No Note Found")
        return result
    }

    fun deleteNoteComment(id: Int): Boolean {
        var result = false
        for (noteComment: Note in noteComments)
            if (id == noteComment.noteId) {
                noteComment.isDeleted = true
                result = true
            }
        if (!result) throw PostNotFoundException("No Note or comment Found")
        return result
    }

    fun noteCommentUpdate(noteComment: NoteComment): Boolean {
        var result = false
        for ((index, storeNote: Note) in notes.withIndex())
            if (note.noteId == storeNote.noteId) {
                notes[index] = note.copy(title = storeNote.title, text = storeNote.text)
                result = true
            }
        return result
    }



/*    fun show() {
        for ((index, storeNote: Note) in notes.withIndex())
            println("номер в массиве $index равно $storeNote")
    }*/










/*
    private var notes = mutableListOf<Note, NoteComment>()

    fun add(note: Note): Boolean {
        notes += note
        return true
    }

    fun show() {
        for ((index, storeNote: Note) in notes.withIndex())
            println("номер в массиве $index равно $storeNote")
    }
*/

}