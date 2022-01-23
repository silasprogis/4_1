package ru.netology

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = post.id + 1)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, storePost: Post) in posts.withIndex())
            if (post.id == storePost.id) {
                posts[index] = storePost.copy()
            }
    }
}