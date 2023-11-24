package com.example.android_messenger_ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_messenger_ui.R
import com.example.android_messenger_ui.adapter.ChatAdapter
import com.example.android_messenger_ui.model.Chat
import com.example.android_messenger_ui.model.Message
import com.example.android_messenger_ui.model.Room

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList<Chat>()

        val rooms: ArrayList<Room> = ArrayList<Room>()
        rooms.add(Room(R.drawable.profile_img1, "Gaffarov Jakhongir"))
        rooms.add(Room(R.drawable.profile_img2, "Gaffarov Jakhongir2"))
        rooms.add(Room(R.drawable.profile_img3, "Gaffarov Jakhongir3"))
        rooms.add(Room(R.drawable.profile_img1, "Gaffarov Jakhongir"))
        rooms.add(Room(R.drawable.profile_img2, "Gaffarov Jakhongir2"))
        rooms.add(Room(R.drawable.profile_img3, "Gaffarov Jakhongir3"))
        rooms.add(Room(R.drawable.profile_img1, "Gaffarov Jakhongir"))
        rooms.add(Room(R.drawable.profile_img2, "Gaffarov Jakhongir2"))
        rooms.add(Room(R.drawable.profile_img3, "Gaffarov Jakhongir3"))

        // Rooms
        chats.add(Chat(rooms))

        // Messages
        chats.add(Chat(Message(R.drawable.profile_img1, "Gaffarov", false)))
        chats.add(Chat(Message(R.drawable.profile_img2, "Gaffarov2", false)))
        chats.add(Chat(Message(R.drawable.profile_img3, "Gaffarov3", true)))
        chats.add(Chat(Message(R.drawable.profile_img1, "Gaffarov", false)))
        chats.add(Chat(Message(R.drawable.profile_img2, "Gaffarov2", false)))
        chats.add(Chat(Message(R.drawable.profile_img3, "Gaffarov3", true)))
        chats.add(Chat(Message(R.drawable.profile_img1, "Gaffarov", false)))
        chats.add(Chat(Message(R.drawable.profile_img2, "Gaffarov2", false)))
        chats.add(Chat(Message(R.drawable.profile_img3, "Gaffarov3", true)))

        return chats
    }
}