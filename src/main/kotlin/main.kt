package ru.netology

fun main () {
    val firstPost = Post(
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
    /*  val secondPost = Post(
        id = 1,
        ownerId = 2,
        fromId = 1,
        createdBy = 1,
        date = 2,
        text = "Post2",
        replyOwnerId = 11,
        replyPostId = 11,
        friendsOnly = true,
        comments = Comments(1, true, true, true, true),
        copyright = Copyright(1, "www.ru1", "Internet1", "impornant1"),
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
    )*/

    WallService.add(Post(ownerId = 100, date = 19, text = "первый пост"))
    WallService.add(Post(ownerId = 101, date = 15, text = "второй пост"))
    WallService.add(Post(ownerId = 102, date = 14, text = "третий пост"))
    WallService.update(firstPost)
//    WallService.show()
}

