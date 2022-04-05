package ru.netology

data class AudioAttachment (
    val audio: Audio,
    override val type: String = "Audio"
) : Attachment