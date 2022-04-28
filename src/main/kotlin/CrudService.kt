package ru.netology

interface CrudService<T, R> {
    fun add(elem: T): T
    fun edit(elem: T): Boolean
    fun show()
    fun createComment(comment: R): R
}