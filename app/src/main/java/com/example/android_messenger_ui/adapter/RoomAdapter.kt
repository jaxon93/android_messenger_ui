package com.example.android_messenger_ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android_messenger_ui.R
import com.example.android_messenger_ui.model.Room
import com.google.android.material.imageview.ShapeableImageView

class RoomAdapter(var context: Context, var items: ArrayList<Room>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_CREATE = 1
    private val TYPE_NOT_CREATE = 0

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        var room = items[position]
        if (room.isCreate)
            return TYPE_CREATE
        return TYPE_NOT_CREATE
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if(viewType == TYPE_CREATE) {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_room_create, parent, false)
            return RoomCreateViewHolder(view)
        }
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_room_view, parent, false)
        return RoomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val room = items[position]

        if (holder is RoomCreateViewHolder) {
            var iv_icon = holder.iv_icon
            var tv_text = holder.tv_text
            iv_icon.setImageResource(room.profile)
            tv_text.text = room.fullname
        }

        if (holder is RoomViewHolder) {
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            iv_profile.setImageResource(room.profile)
            tv_fullname.text = room.fullname
        }
    }

    class RoomViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_profile: ShapeableImageView
        var tv_fullname: TextView

        init {
            iv_profile = view.findViewById(R.id.iv_profile)
            tv_fullname = view.findViewById(R.id.tv_fullname)
        }
    }

    class RoomCreateViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var iv_icon: ShapeableImageView
        var tv_text: TextView

        init {
            iv_icon = view.findViewById(R.id.iv_icon)
            tv_text = view.findViewById(R.id.tv_text)
        }
    }
}