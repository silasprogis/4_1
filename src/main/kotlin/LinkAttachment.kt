package ru.netology

interface LinkAttachment {
    val type: Link
    val id: Int
    val albumId: Int
    val ownerId: Int
    val userId: Int

}