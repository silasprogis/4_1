package ru.netology

import org.junit.Assert.*
import java.lang.RuntimeException

class NoteServiceTest {
    @org.junit.Test
    fun isEditTrue() {
        // создаём целевой сервис
        val service = NoteService
        // заполняем несколькими постами
        service.add(Note(1,"note1", "textofnote1"))
        service.add(Note(2,"note2", "textofnote2"))
        service.add(Note(3,"note3", "textofnote3"))
        // создаём информацию об обновлении
        val edit = Note(2,"note22", "textofnote222")

        // выполняем целевое действие
        val result = service.edit(edit)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }
    @org.junit.Test
    fun isFalse() {
        // создаём целевой сервис
        val service = NoteService
        // заполняем несколькими постами
        service.add(Note(1, "note1", "textofnote1"))
        service.add(Note(2, "note2", "textofnote2"))
        service.add(Note(3, "note3", "textofnote3"))
        // создаём информацию об обновлении
        val edit = Note(4, "note22", "textofnote222")

        // выполняем целевое действие
        val result = service.edit(edit)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

    @org.junit.Test
    fun isAdded() {
        // создаём целевой сервис
        val service = NoteService
        // создаем note
        val add = Note(1, "note1", "textofnote1")

        // добавляем note
        val result = service.add(add)

        // проверяем наличие id
        assertEquals(add.noteId,result.noteId)
    }

    @org.junit.Test
    fun isCommentCreated() {
        // создаём целевой сервис
        val service = NoteService
        // создаем note и коммент
        val add = Note(1, "note1", "textofnote1")
        val addComment = NoteComment( 1,  1,"noteCommentText1")

        // добавляем коммент
        service.add(add)
        val resultComment = service.createComment(addComment)

        // проверяем равенство id в посте и в комменте
        assertEquals(addComment.commentId, resultComment.commentId)
    }

    @org.junit.Test
    fun isNoteDeleted() {
        // создаём целевой сервис
        val service = NoteService
        // создаем note
        val add = Note(1, "note1", "textofnote1")

        // добавляем и удаляем note
        service.add(add)
        val result = service.delete(1)

        // проверяем признак удаления
        assertTrue(result)
    }

    @org.junit.Test
    fun isNoteEdited() {
        // создаём целевой сервис
        val service = NoteService
        // создаем note
        val add = Note(1, "note1", "textofnote1")
        val edit = Note(1, "note2", "textofnote2")
        // добавляем и редактируем note
        service.add(add)
        val result = service.edit(edit)

        // проверяем признак удаления
        assertTrue(result)
    }

    @org.junit.Test
    fun isNoteCommentDeleted() {
        // создаём целевой сервис
        val service = NoteService
        // создаем note и коммент
        val add = Note(1, "note1", "textofnote1")
        val addComment = NoteComment( 1,  1,"noteCommentText1")

        // добавляем и удаляем коммент
        service.add(add)
        service.createComment(addComment)
        val result = service.deleteComment(1)

        // проверяем признак удаления
        assertTrue(result)
    }

    @org.junit.Test
    fun isNoteCommentEdited() {
        // создаём целевой сервис
        val service = NoteService
        // создаем note и комменты
        val add = Note(1, "note1", "textofnote1")
        val addComment = NoteComment( 1,  1,"noteCommentText1")
        val editComment = NoteComment( 1,  1,"noteCommentText11")

        // добавляем и редактируем comment
        service.add(add)
        service.createComment(addComment)
        val result = service.editComment(editComment)

        // проверяем признак удаления
        assertTrue(result)
    }

    @org.junit.Test
    fun isNoteCommentRestored() {
        // создаём целевой сервис
        val service = NoteService
        // создаем note и коммент
        val add = Note(1, "note1", "textofnote1")
        val addComment = NoteComment( 1,  1,"noteCommentText1")

        // добавляем, удаляем  и восстанавливаем коммент
        service.add(add)
        service.createComment(addComment)
        service.deleteComment(1)
        val result = service.restoreComment(1)

        // проверяем признак удаления
        assertTrue(result)
    }

}