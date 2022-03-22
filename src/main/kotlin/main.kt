package ru.netology

fun main () {
    val firstPost = Post(
        id = 0,
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
    val secondPost = Post(
        id = 1,
        ownerId = 1,
        fromId = 1,
        createdBy = 1,
        date = 1,
        text = "Post2",
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

    WallService.add(firstPost)
    WallService.update(secondPost)
}

