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
    private var chatId = 1
    private var messageIds = 1

    fun add(message: Message): Boolean {
    val key = Pair(message.userId,message.toUserId)
    val keyBackwards = Pair(message.toUserId,message.userId)
    var chat: Chat

    if (chats.isEmpty()) {
        chats[key] = Chat(chatId, mutableListOf(message) , 1, 1,false)
        chatId++
        return true
    } else  if (chats[key] == null && chats[keyBackwards] == null ) {
        chats[key] = Chat(chatId, mutableListOf(message), 1, 1, false)
        chats[key]!!.chatMessages.last().messageId = messageIds
        chats[key]!!.unreadMessageCount = chats[key]!!.chatMessages.count { message: Message -> !message.isRed || message.isDeleted }
        messageIds++
        chatId++

    } else if (chats[key] == null) {

        chat = chats[keyBackwards]!!
        chat.chatMessages.add(message)
        chat.messageCount = chat.chatMessages.count { message: Message -> !message.isDeleted }
        chat.chatMessages.last().messageId = messageIds
        chat.unreadMessageCount = chat.chatMessages.count { message: Message -> !message.isRed || message.isDeleted }
        messageIds++

    } else {
        chat = chats[key]!!
        chat.chatMessages.add(message)
        chat.messageCount = chat.chatMessages.count { message: Message -> !message.isDeleted }
        chat.chatMessages.last().messageId = messageIds
        chat.unreadMessageCount = chat.chatMessages.count { message: Message -> !message.isRed || message.isDeleted }
        messageIds++
    }
        //for ((index, storeKey: Pair<Int, Int>) in chats.keys.withIndex())
            /*when (storeKey) {
                key -> {
                    chat = chats[key]!!
                    chat.chatMessages.add(message)
                }
                keyBackwards -> {
                    chat = chats[keyBackwards]!!
                    chat.chatMessages.add(message)
                }*/
           /* if (storeKey.equals(key)) {
                chat = chats[key]!!
                chat.chatMessages.add(message)
            } else if (storeKey.equals(keyBackwards)) {
                chat = chats[keyBackwards]!!
                chat.chatMessages.add(message)
            }  else {
                    chats[key] = Chat(0, mutableListOf(message), 0, 0, false)
                }*/
        return false

    }


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

    fun show() {
        chats.forEach { println(it)}
        chats.keys.forEach { println(it) }
    }

}
