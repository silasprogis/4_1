package ru.netology

data class NoteComment (
    val noteCommentId: Int,
    var noteCommentTitle: String?,
    var noteCommentText: String?,
    var isDeteted: Boolean = false
)