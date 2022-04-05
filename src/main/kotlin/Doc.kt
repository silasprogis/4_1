package ru.netology

data class Doc (
    var id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int
)