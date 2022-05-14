package ru.netology

data class Message(
    var messageId: Int = 0,
    val userId: Int,
    val toUserId: Int,
    val text: String?,
    var isRed: Boolean = false,
    var isDeleted: Boolean = false

/*    val chatId: Int = 1,

    var isDeleted: Boolean = false*/
)
