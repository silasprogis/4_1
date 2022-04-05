package ru.netology

data class Comment(
    val ownerId: Int,
    var postId: Int,
    val fromGroup: Int = 0,
    val text: String
)