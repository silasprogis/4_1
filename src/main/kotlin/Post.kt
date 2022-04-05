package ru.netology

data class Post(
    val id: Int = 0,
    val ownerId: Int,
    val fromId: Int = 2,
    val createdBy: Int = 1,
    val date: Int,
    var text: String?,
    val replyOwnerId: Int = 3,
    val replyPostId: Int = 3,
    val friendsOnly: Boolean = false,
    val comments: Comments = Comments(1, true, true, true, true),
    val copyright: Copyright = Copyright(1, "www.ru", "Internet", "impornant"),
    val likes: Likes = Likes(true, true, true),
    val reposts: Reposts = Reposts(1, false),
    val views: Views = Views(10),
    val signerId: Int = 11,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = true,
    val markedAsAds: Boolean = true,
    val donut: Donut = Donut(true, 10, true, "on"),
    val postponedId: Int? = 12,
)


class Likes (
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean,
    count: Int = 0
) {
    var count = count
        set (value) {
            if (value < 0) {
                return
            }
            field = value
        }
}

class Comments (
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)
class Copyright (
    val id: Int,
    val link: String,
    val name: String,
    val type: String,
)
class Reposts (
    val count: Int,
    val userReposted: Boolean,
)
class Views (
    val count: Int
)
class Donut (
    val isDonut: Boolean,
    val paidDuration: Int,
//    val placeholder: Placeholder, TODO
    val canPublishFreeCopy: Boolean,
    val editMode: String
)

