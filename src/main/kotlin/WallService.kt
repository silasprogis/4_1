package ru.netology

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val nullText = "нет текста"
        post.text = post.text ?: nullText
        if (posts.isEmpty() == true) {
            posts += post.copy(id = 1)
        } else {
            posts += post.copy(id = posts.last().id + 1)
        }

        //posts += post
//        println(posts.last())
        return posts.last()

    }


    fun update(post: Post): Boolean {
        var result = false
        for ((index, storePost: Post) in posts.withIndex())
            if (post.id == storePost.id) {
                posts[index] = post.copy(ownerId = storePost.ownerId, date = storePost.date)
//                posts[index] = storePost.copy(ownerId = post.ownerId, date = post.date)
                result = true
            }
        return result
    }
    fun show() {
        for ((index, storePost: Post) in posts.withIndex())
            println("номер в массиве $index равно $storePost")
    }
    fun attach(postID: Int, attachment: Attachment): Boolean {
        var result = false
        for ((index, storePost: Post) in posts.withIndex())
            if (postID == storePost.id) {
                posts[index].attachment += attachment
                result = true
            }
        return result
    }
}