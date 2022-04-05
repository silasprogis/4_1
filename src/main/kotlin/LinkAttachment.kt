package ru.netology

data class LinkAttachment (
    val link: Link,
    override val type: String = "Link"
): Attachment