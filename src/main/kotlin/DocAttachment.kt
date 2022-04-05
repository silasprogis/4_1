package ru.netology

data class DocAttachment (
    val doc: Doc,
    override val type: String = "Doc"
) : Attachment