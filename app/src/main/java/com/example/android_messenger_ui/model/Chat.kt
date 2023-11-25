package com.example.android_messenger_ui.model

class Chat {
    var message: Message? = null
<<<<<<< HEAD
    var rooms : ArrayList<Room> = ArrayList()

    constructor(message: Message) {
        this.message = message
    }

    constructor(rooms: ArrayList<Room>) {
=======
    var rooms: ArrayList<Room> = ArrayList()

    constructor(message: Message){
        this.message = message
    }

    constructor(rooms: ArrayList<Room>){
>>>>>>> 9030880 (final)
        this.rooms = rooms
    }
}