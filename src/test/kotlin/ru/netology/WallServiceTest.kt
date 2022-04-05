package ru.netology

import org.junit.Assert.*
import java.lang.RuntimeException

class WallServiceTest {

    @org.junit.Test
    fun isUpdateTrue() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(Post(ownerId = 100, date = 19, text = "первый пост"))
        service.add(Post(ownerId = 101, date = 15, text = "второй пост"))
        service.add(Post(ownerId = 102, date = 14, text = "третий пост"))
        // создаём информацию об обновлении
        val update = Post(id = 3, ownerId = 104, date = 22, text = "update")

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
      }
    @org.junit.Test
    fun isUpdateFalse() {
        // создаём целевой сервис
        val service = WallService
        // заполняем несколькими постами
        service.add(Post(ownerId = 100, date = 19, text = "первый пост"))
        service.add(Post(ownerId = 101, date = 15, text = "второй пост"))
        service.add(Post(ownerId = 102, date = 14, text = "третий пост"))
        // создаём информацию об обновлении
        val update = Post(id = 4, ownerId = 104, date = 22, text = "update")

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

    @org.junit.Test
    fun isAdded() {
        // создаём целевой сервис
        val service = WallService
        // создаем пост
        val add = Post(ownerId = 100, date = 19, text = "первый пост")

        // добавляем пост
        val result = service.add(add)

        // проверяем отличие исходного и нового id
        assertNotEquals(add.id,result.id)
    }

    @org.junit.Test
    fun isCommentAdded() {
        // создаём целевой сервис
        val service = WallService
        // создаем пост и коммент
        val addPost = Post(ownerId = 100, date = 19, text = "первый пост")
        val addComment = Comment(1,1,"Test")

        // добавляем пост и коммент
        val resultPost = service.add(addPost)
        val resultComment = service.createComment(addComment)

        // проверяем равенство id в посте и в комменте
        assertEquals(resultPost.id, resultComment.postId)
    }

    @org.junit.Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val service = WallService
        service.createComment(Comment(1,5,"Test"))
    }
    class PostNotFoundException(message: String): RuntimeException(message)
}