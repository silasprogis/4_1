package ru.netology

object ChatService {

    /*
    //    private var oneChat = mutableListOf<Message>()
    private var chats = mutableListOf<Message>()
    private var chatIdMax: Int = 1
    private var messageIdMax: Int = 1

    fun add(message: Message): Message {
        var chatIndex = -1
        var firstMessage = false
        if (chats.isEmpty()) {
            chats.add(message)
            chatIdMax++
            messageIdMax++
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
            messageIdMax++
        } else if (!firstMessage) {
            chats += message.copy(messageId = messageIdMax, chatId = chatIdMax)
            chatIdMax++
            messageIdMax++
        }
        return chats.last()
    }

    fun getUnreadChatsCount() {
        println(chats.filter { message: Message -> !message.isRed || message.isDeleted }
            .groupBy { message: Message -> message.chatId }
            .count())
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
*/
   private var chats: MutableMap<Pair<Int, Int>, Chat> = mutableMapOf()

/*    data class Chat(
        var chatId: Int = 0,
        var chatMessages: MutableList<Message> = mutableListOf(),
        var messageCount: Int = 0,
        var unreadMessageCount: Int = 0,
        var red: Boolean = false
    )*/
    fun add(message: Message): Boolean {
    val key = Pair(message.userId,message.toUserId)
    val chat: Chat
    if (chats.isEmpty()) {
        chats[key] = Chat(0, mutableListOf(message) , 0, 0,false)
    } else return false
   /*     if ()
    chats.put(key, )
    chat.chatMessages.add(message)*/

        /*    chatIdMax++
            messageIdMax++
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
            messageIdMax++
        } else if (!firstMessage) {
            chats += message.copy(messageId = messageIdMax, chatId = chatIdMax)
            chatIdMax++
            messageIdMax++
        }
        return chats.last()*/
    return true
    }
    fun show() {
        chats.forEach { println(it)}
    }

}
