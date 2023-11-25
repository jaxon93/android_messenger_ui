package com.example.messenger_people_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messenger_people_kotlin.R
import com.example.messenger_people_kotlin.model.Story
import com.google.android.material.imageview.ShapeableImageView


class StoryAdapter(var context: Context, var items: ArrayList<Story>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_ADD_STORY = 1
    private val TYPE_STORY = 0

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        var room = items[position]
        if (room.isAdd)
            return TYPE_ADD_STORY
        return TYPE_STORY
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == TYPE_ADD_STORY) {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_add_story, parent, false)
            return AddStoryViewHolder(view)
        }
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val room = items[position]

        if (holder is AddStoryViewHolder) {
            var iv_story = holder.iv_story
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            iv_story.setImageResource(room.story)
            iv_profile.setImageResource(room.profile)
            tv_fullname.text = room.fullname
        }

        if (holder is StoryViewHolder) {
            var iv_story = holder.iv_story
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var tv_count = holder.tv_count

            iv_story.setImageResource(room.story)
            iv_profile.setImageResource(room.profile)
            tv_fullname.text = room.fullname
            tv_count.text = room.count
        }
    }

    class AddStoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var iv_story: ShapeableImageView
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView

        init {
            iv_story = view.findViewById(R.id.iv_story)
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
        }
    }

    class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_story: ShapeableImageView
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView
        var tv_count: TextView

        init {
            iv_story = view.findViewById(R.id.iv_story)
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
            tv_count = view.findViewById(R.id.tv_count)
        }
    }
}