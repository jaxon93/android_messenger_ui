package com.example.messenger_people_kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messenger_people_kotlin.R
import com.example.messenger_people_kotlin.adapter.StoryAdapter
import com.example.messenger_people_kotlin.model.Story

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        refreshAdapter(getAllChats())
    }

    fun refreshAdapter(chats: ArrayList<Story>) {
        val adapter = StoryAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats(): ArrayList<Story> {
        val stories: ArrayList<Story> = ArrayList<Story>()

        stories.add(Story(R.drawable.story1, R.drawable.add, "Add to Story", "1", true))
        stories.add(Story(R.drawable.story2, R.drawable.profile_img1, "Gaffarov Jakhongir", "1", false))
        stories.add(Story(R.drawable.story3, R.drawable.profile_img2, "Gaffarov Jakhongir2", "2", false))
        stories.add(Story(R.drawable.story4, R.drawable.profile_img3, "Gaffarov Jakhongir3", "3", false))
        stories.add(Story(R.drawable.story2, R.drawable.profile_img1, "Gaffarov Jakhongir", "1", false))
        stories.add(Story(R.drawable.story3, R.drawable.profile_img2, "Gaffarov Jakhongir2", "2", false))
        stories.add(Story(R.drawable.story4, R.drawable.profile_img3, "Gaffarov Jakhongir3", "3", false))
        stories.add(Story(R.drawable.story2, R.drawable.profile_img1, "Gaffarov Jakhongir", "1", false))
        stories.add(Story(R.drawable.story3, R.drawable.profile_img2, "Gaffarov Jakhongir2", "2", false))
        stories.add(Story(R.drawable.story4, R.drawable.profile_img3, "Gaffarov Jakhongir3", "3", false))
        stories.add(Story(R.drawable.story2, R.drawable.profile_img1, "Gaffarov Jakhongir", "1", false))
        stories.add(Story(R.drawable.story3, R.drawable.profile_img2, "Gaffarov Jakhongir2", "2", false))
        stories.add(Story(R.drawable.story4, R.drawable.profile_img3, "Gaffarov Jakhongir3", "3", false))
        return stories
    }
}