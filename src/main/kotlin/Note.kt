package ru.netology

data class Note(
    val noteId: Int,
    val title: String?,
    var text: String?,
    var isDeleted: Boolean = false
)
