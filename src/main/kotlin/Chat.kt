package ru.netology

data class Chat(
    val userId: Int,
    val chatId: Int,
    var message: Message
)
