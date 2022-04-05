package ru.netology

data class VideoAttachment (
    val video: Video,
    override val type: String = "Video"

): Attachment