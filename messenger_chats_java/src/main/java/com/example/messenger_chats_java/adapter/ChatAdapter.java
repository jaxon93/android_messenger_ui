package com.example.messenger_chats_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.messenger_chats_java.R;
import com.example.messenger_chats_java.model.Chat;
import com.example.messenger_chats_java.model.Room;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ITEM_ROOM = 0;
    private static final int TYPE_ITEM_MESSAGE = 1;

    private Context context;
    private ArrayList<Chat> items;

    public ChatAdapter(Context context, ArrayList<Chat> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        Chat chat = items.get(position);
        return (chat.getRooms().size() > 0) ? TYPE_ITEM_ROOM : TYPE_ITEM_MESSAGE;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        if (viewType == TYPE_ITEM_ROOM) {
            View view = inflater.inflate(R.layout.item_chat_room, parent, false);
            return new RoomViewHolder(context, view);
        } else {
            View view = inflater.inflate(R.layout.item_chat_message, parent, false);
            return new MessageViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Chat chat = items.get(position);

        if (holder instanceof RoomViewHolder) {
            RoomViewHolder roomViewHolder = (RoomViewHolder) holder;
            RecyclerView recyclerView = roomViewHolder.recyclerView;
            refreshAdapter(chat.getRooms(), recyclerView);
        }

        if (holder instanceof MessageViewHolder) {
            MessageViewHolder messageViewHolder = (MessageViewHolder) holder;
            ShapeableImageView iv_profile = messageViewHolder.iv_profile;
            TextView tv_fullname = messageViewHolder.tv_fullname;
            LinearLayout is_online = messageViewHolder.is_online;

            iv_profile.setImageResource(chat.getMessage().getProfile());
            tv_fullname.setText(chat.getMessage().getFullname());

            if (chat.getMessage().isOnline()) {
                is_online.setVisibility(View.VISIBLE);
            } else {
                is_online.setVisibility(View.GONE);
            }
        }
    }

    private void refreshAdapter(ArrayList<Room> rooms, RecyclerView recyclerView) {
        RoomAdapter adapter = new RoomAdapter(context, rooms);
        recyclerView.setAdapter(adapter);
    }

    public static class RoomViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;

        public RoomViewHolder(Context context, View view) {
            super(view);
            recyclerView = view.findViewById(R.id.recyclerView);
            LinearLayoutManager manager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
            recyclerView.setLayoutManager(manager);
        }
    }

    public static class MessageViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView iv_profile;
        TextView tv_fullname;
        LinearLayout is_online;

        public MessageViewHolder(View view) {
            super(view);
            iv_profile = view.findViewById(R.id.iv_profile);
            tv_fullname = view.findViewById(R.id.tv_fullname);
            is_online = view.findViewById(R.id.is_online);
        }
    }
}
