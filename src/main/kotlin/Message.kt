package ru.netology

data class Message(
    val userId: Int,
    val toUserId: Int,
    val text: String?,
    val messageId: Int = 1,
    val chatId: Int = 1,
    var isRed: Boolean = false,
    var isDeleted: Boolean = false
)
