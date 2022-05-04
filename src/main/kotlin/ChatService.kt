package ru.netology

object ChatService: CrudService<Message, Chat> {

    private var oneChat = mutableListOf<Message>()
    private var chats = mutableListOf<Chat>()

    override fun add(message: Message): Message {
        oneChat.add(message)
        return oneChat.last()
    }

/*    val notRed: List<Message> = oneChat.filter { !it.isRed }*/

    fun MutableList<Message>.makeRead(oneChat: MutableList<Message>){

    }


    override fun edit(elem: Message): Boolean {
        TODO("Not yet implemented")
    }
}

/*

    override fun show() {
        for (note: Note in notes)
            if (!note.isDeleted) {
                println("Запись:___ $note")
                for (noteComment: NoteComment in noteComments)
                    if (!noteComment.isDeleted && noteComment.noteId == note.noteId) {
                        println("Комментарий $noteComment")
                    }
            }
    }

    override fun edit(note: Note): Boolean {
        var result = false
        for ((index, storeNote: Note) in notes.withIndex())
            if (note.noteId == storeNote.noteId) {
                notes[index] = note.copy(title = storeNote.title, text = storeNote.text)
                result = true
            }
        return result
    }*/
