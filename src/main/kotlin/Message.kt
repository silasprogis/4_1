package ru.netology

data class Message(
    val userId: Int,
    var text: String?,
    var isRed: Boolean = false,
    val isIncoming: Boolean = false
)
