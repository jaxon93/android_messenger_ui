package com.example.messenger_chats_java.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.messenger_chats_java.R;
import com.example.messenger_chats_java.adapter.ChatAdapter;
import com.example.messenger_chats_java.model.Chat;
import com.example.messenger_chats_java.model.Message;
import com.example.messenger_chats_java.model.Room;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        refreshAdapter(getAllChats());
    }

    private void refreshAdapter(ArrayList<Chat> chats) {
        ChatAdapter adapter = new ChatAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Chat> getAllChats() {
        ArrayList<Chat> chats = new ArrayList<>();

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(R.drawable.ic_add_video2, "Create  room", true));
        rooms.add(new Room(R.drawable.profile_img1, "Gaffarov Jakhongir", false));
        rooms.add(new Room(R.drawable.profile_img2, "Gaffarov Jakhongir2", false));
        rooms.add(new Room(R.drawable.profile_img3, "Gaffarov Jakhongir3", false));
        rooms.add(new Room(R.drawable.profile_img1, "Gaffarov Jakhongir", false));
        rooms.add(new Room(R.drawable.profile_img2, "Gaffarov Jakhongir2", false));
        rooms.add(new Room(R.drawable.profile_img3, "Gaffarov Jakhongir3", false));
        rooms.add(new Room(R.drawable.profile_img1, "Gaffarov Jakhongir", false));
        rooms.add(new Room(R.drawable.profile_img2, "Gaffarov Jakhongir2", false));
        rooms.add(new Room(R.drawable.profile_img3, "Gaffarov Jakhongir3", false));
        rooms.add(new Room(R.drawable.profile_img1, "Gaffarov Jakhongir", false));
        rooms.add(new Room(R.drawable.profile_img2, "Gaffarov Jakhongir2", false));
        rooms.add(new Room(R.drawable.profile_img3, "Gaffarov Jakhongir3", false));

        // Rooms
        chats.add(new Chat(rooms));

        // Messages
        chats.add(new Chat(new Message(R.drawable.profile_img1, "Gaffarov", false)));
        chats.add(new Chat(new Message(R.drawable.profile_img2, "Gaffarov2", false)));
        chats.add(new Chat(new Message(R.drawable.profile_img3, "Gaffarov3", true)));
        chats.add(new Chat(new Message(R.drawable.profile_img1, "Gaffarov", false)));
        chats.add(new Chat(new Message(R.drawable.profile_img2, "Gaffarov2", false)));
        chats.add(new Chat(new Message(R.drawable.profile_img3, "Gaffarov3", true)));
        chats.add(new Chat(new Message(R.drawable.profile_img1, "Gaffarov", false)));
        chats.add(new Chat(new Message(R.drawable.profile_img2, "Gaffarov2", false)));
        chats.add(new Chat(new Message(R.drawable.profile_img3, "Gaffarov3", true)));
        chats.add(new Chat(new Message(R.drawable.profile_img1, "Gaffarov", false)));
        chats.add(new Chat(new Message(R.drawable.profile_img2, "Gaffarov2", false)));
        chats.add(new Chat(new Message(R.drawable.profile_img3, "Gaffarov3", true)));

        return chats;
    }
}
