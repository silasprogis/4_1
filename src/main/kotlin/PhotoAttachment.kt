package ru.netology

data class PhotoAttachment (
    val photo: Photo,
    override val type: String = "Photo"
): Attachment