package com.example.messenger_chats_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.messenger_chats_java.R;
import com.example.messenger_chats_java.model.Room;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class RoomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_CREATE = 1;
    private static final int TYPE_NOT_CREATE = 0;

    private Context context;
    private ArrayList<Room> items;

    public RoomAdapter(Context context, ArrayList<Room> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        Room room = items.get(position);
        return room.isCreate() ? TYPE_CREATE : TYPE_NOT_CREATE;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        if (viewType == TYPE_CREATE) {
            View view = inflater.inflate(R.layout.item_room_create, parent, false);
            return new RoomCreateViewHolder(view);
        } else {
            View view = inflater.inflate(R.layout.item_room_view, parent, false);
            return new RoomViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Room room = items.get(position);

        if (holder instanceof RoomCreateViewHolder) {
            RoomCreateViewHolder createViewHolder = (RoomCreateViewHolder) holder;
            ShapeableImageView iv_icon = createViewHolder.iv_icon;
            TextView tv_text = createViewHolder.tv_text;
            iv_icon.setImageResource(room.getProfile());
            tv_text.setText(room.getFullname());
        }

        if (holder instanceof RoomViewHolder) {
            RoomViewHolder roomViewHolder = (RoomViewHolder) holder;
            ShapeableImageView iv_profile = roomViewHolder.iv_profile;
            TextView tv_fullname = roomViewHolder.tv_fullname;
            iv_profile.setImageResource(room.getProfile());
            tv_fullname.setText(room.getFullname());
        }
    }

    public static class RoomViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView iv_profile;
        TextView tv_fullname;

        public RoomViewHolder(View view) {
            super(view);
            iv_profile = view.findViewById(R.id.iv_profile);
            tv_fullname = view.findViewById(R.id.tv_fullname);
        }
    }

    public static class RoomCreateViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView iv_icon;
        TextView tv_text;

        public RoomCreateViewHolder(View view) {
            super(view);
            iv_icon = view.findViewById(R.id.iv_icon);
            tv_text = view.findViewById(R.id.tv_text);
        }
    }
}
