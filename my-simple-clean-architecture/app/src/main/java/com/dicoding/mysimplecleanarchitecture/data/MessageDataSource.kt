package com.dicoding.mysimplecleanarchitecture.data

import com.dicoding.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
        MessageEntity("Hello $name! welcome to Clean Architecture", " Haha")
}