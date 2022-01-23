package ru.netology

fun main () {
    val firstPost = Post(
        ownerId = 1,
        fromId = 1,
        createdBy = 1,
        date = 1,
        text = "Post",
        replyOwnerId = 1,
        replyPostId = 1,
        friendsOnly = true,
/*
    comments: Comments,
    copyright: Copyright,
    likes: Likes,
    reposts: Reposts,
    views: Views,
*/
        signerId = 1,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned= true,
        markedAsAds= true,
//    donut: Donut,
        postponedId = 1,
    )

    WallService.add(firstPost)
    WallService.update(firstPost)
}

