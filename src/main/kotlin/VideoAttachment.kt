package ru.netology

interface VideoAttachment {
    val type: Video
    val id: Int
    val albumId: Int
    val ownerId: Int
    val userId: Int
}