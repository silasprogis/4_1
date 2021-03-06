package ru.netology

fun main () {
    val updatePost = Post(
        id = 1,
        ownerId = 1,
        fromId = 1,
        createdBy = 1,
        date = 1,
        text = "Post",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = true,
        comments = Comments(1, true, true, true, true),
        copyright = Copyright(1, "www.ru", "Internet", "impornant"),
        likes = Likes(true, true, true),
        reposts = Reposts(1, false),
        views = Views(10),
        signerId = 1,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned= true,
        markedAsAds= true,
        donut = Donut(true, 10, true, "on"),
        postponedId = 1,
    )
    val video = VideoAttachment(Video(1,2,"3","4"))
    val video1 = VideoAttachment(Video(1,2,"3","4"))

    WallService.add(Post(ownerId = 100, date = 19, text = "первый пост"))
    WallService.add(Post(ownerId = 101, date = 15, text = "второй пост"))
    WallService.add(Post(ownerId = 102, date = 14, text = "третий пост"))
    WallService.add(Post(ownerId = 102, date = 14, text = null))
    WallService.update(updatePost)
    WallService.attach(1, video)
    WallService.attach(1, video1)
    WallService.createComment(Comment(1,5,"Test"))
    WallService.show()
}

