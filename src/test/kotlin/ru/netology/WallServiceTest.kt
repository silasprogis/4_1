package ru.netology

import org.junit.Assert.*

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
}