package ru.netology

data class NoteComment (
    val commentId: Int,
    val noteId: Int,
    var message: String?,
    var isDeleted: Boolean = false
)