package ru.netology

data class Message(
    val userId: Int,
    val toUserId: Int,
    var text: String?,
    var isRed: Boolean = false,
    val isIncoming: Boolean = false
)
