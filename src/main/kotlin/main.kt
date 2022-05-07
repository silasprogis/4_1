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
    val note1 = Note(1,"note1", "textofnote1")
    val note2 = Note(2,"note2", "textofnote2")
    val noteComment1 = NoteComment( 1,  1,"noteCommentText1")
    val noteComment2 = NoteComment( 2,  1,"noteCommentText2")
    val noteComment3 = NoteComment( 3,  2,"noteCommentText3")
    val noteComment4 = NoteComment( 4,  2,"noteCommentText4")
    val noteComment5 = NoteComment( 2,  1,"noteCommentText2Corrected")

/*    WallService.add(Post(ownerId = 100, date = 19, text = "первый пост"))
    WallService.add(Post(ownerId = 101, date = 15, text = "второй пост"))
    WallService.add(Post(ownerId = 102, date = 14, text = "третий пост"))
    WallService.add(Post(ownerId = 102, date = 14, text = null))
    WallService.update(updatePost)
    WallService.attach(1, video)
    WallService.attach(1, video1)
    //WallService.createComment(Comment(100,5,"Test"))
    WallService.show()*/

    NoteService.add(note1)
    NoteService.add(note2)
    NoteService.createComment(noteComment1)
    NoteService.createComment(noteComment2)
    NoteService.createComment(noteComment3)
    NoteService.show()
    NoteService.editComment(noteComment5)
    NoteService.show()
    NoteService.deleteComment(1)
    NoteService.show()
    NoteService.restoreComment(1)
    NoteService.restoreComment(2)
    NoteService.show()
    NoteService.delete(1)
    NoteService.show()

    val lambda = {a: Int , c: Int -> a*c}
    println (lambda(5,3))

    fun multiply (a: Int): Int {
    val b = a*5
    return b
    }
    println (multiply(5))
}

