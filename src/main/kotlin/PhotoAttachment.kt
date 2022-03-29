package ru.netology

interface PhotoAttachment {
    val type: Photo
    val id: Int
    val albumId: Int
    val ownerId: Int
    val userId: Int
}