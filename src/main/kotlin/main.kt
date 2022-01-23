package ru.netology

data class Post (
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val donut: Donut,
    val postponedId: Int,
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
    val placeholder: Placeholder,
    val canPublishFreeCopy: Boolean,
    val editMode: String
)

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }

}