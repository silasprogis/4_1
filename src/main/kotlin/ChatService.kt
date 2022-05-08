package ru.netology

object ChatService {

    //    private var oneChat = mutableListOf<Message>()
    private var chats = mutableListOf<Message>()
    private var chatIdMax: Int = 1
    private var messageIdMax: Int = 1

    fun add(message: Message): Message {
        var chatIndex = -1
        var firstMessage = false
        if (chats.isEmpty()) {
            chats.add(message)
            chatIdMax += 1
            messageIdMax += 1
            firstMessage = true
        } else {
            for ((index, storeChat: Message) in chats.withIndex())
                if ((message.userId == storeChat.userId && message.toUserId == storeChat.toUserId) ||
                    (message.userId == storeChat.toUserId && message.toUserId == storeChat.userId)) {
                    chatIndex = index
                }
        }
        if ( chatIndex != -1 ) {
            chats += message.copy(messageId = messageIdMax, chatId = chats[chatIndex].chatId)
            messageIdMax += 1
        } else if (!firstMessage) {
            chats += message.copy(messageId = messageIdMax, chatId = chatIdMax)
            chatIdMax += 1
            messageIdMax += 1
        }
        return chats.last()
    }

    fun getUnreadChatsCount() {
        println(chats.filter { message: Message -> !message.isRed || message.isDeleted }.groupBy { message: Message -> message.chatId }.count())
    }

    fun getChats() {
        println(chats.groupBy { message: Message -> message.chatId })
    }

    fun getChatMessages(chatId: Int) {
        for ((index, storeChat: Message) in chats.withIndex())
            if (storeChat.chatId == chatId) {
                storeChat.isRed = true
            }
        println(chats.filter { message: Message -> message.chatId == chatId })
    }

    fun messageDelete(messageId: Int) {
        chats.forEach { if (messageId == it.messageId) it.isDeleted = true}
    }

    fun show() {
        chats.forEach { println(it)}
    }
}
