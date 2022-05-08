package ru.netology

object NoteService: CrudService<Note, NoteComment> {

    private var notes = mutableListOf<Note>()
    private var noteComments = mutableListOf<NoteComment>()

    override fun add(note: Note): Note {
        notes.add(note)
        return notes.last()
    }

    override fun show() {
        for (note: Note in notes)
            if (!note.isDeleted) {
                println("Запись:___ $note")
                for (noteComment: NoteComment in noteComments)
                    if (!noteComment.isDeleted && noteComment.noteId == note.noteId) {
                        println("Комментарий $noteComment")
                    }
            }
    }

    override fun edit(note: Note): Boolean {
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
            if (note.noteId == noteComment.noteId) {
                noteComments.add(noteComment)
                result = true
            }
        if (!result) throw PostNotFoundException("No Note Found")
        return noteComments.last()
    }
    fun delete(noteId: Int): Boolean {
        var result = false
        for (note: Note in notes)
            if (noteId == note.noteId) {
                note.isDeleted = true
                println("запись ${note.text} удалена")
                result = true
            }
        if (!result) throw PostNotFoundException("No Note Found")
        return result
    }

    fun deleteComment(noteId: Int): Boolean {
        var result = false
        for ((index, storeNoteComment: NoteComment) in noteComments.withIndex())
            if (noteId == storeNoteComment.noteId) {
                noteComments[index].isDeleted = true
                println("комментарий ${noteComments[index].message} удален")
                result = true
            }
        if (!result) throw PostNotFoundException("No Note or comment Found")
        return result
    }

    fun editComment(noteComment: NoteComment): Boolean {
        var result = false
        for ((index, storeNoteComment: NoteComment) in noteComments.withIndex())
            if (noteComment.commentId == storeNoteComment.commentId && !noteComment.isDeleted) {
                noteComments[index] = noteComment.copy()
                result = true
            }
        if (!result) throw PostNotFoundException("No NoteComment Found")
        return result
    }
    fun restoreComment(commentId: Int): Boolean {
        var result = false
        for ((index, storeNoteComment: NoteComment) in noteComments.withIndex())
            if (commentId == storeNoteComment.commentId) {
                noteComments[index].isDeleted = false
                println("комментарий ${noteComments[index].message} восстановлен")
                result = true
            }
        if (!result) throw PostNotFoundException("No Note or comment Found")
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