package ru.netology

data class Comment(
    val ownerId: Int,
    var postId: Int,
    val text: String,
    val fromGroup: Int = 0
)