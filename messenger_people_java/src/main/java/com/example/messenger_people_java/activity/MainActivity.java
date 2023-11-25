package com.example.messenger_people_java.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.messenger_people_java.R;
import com.example.messenger_people_java.adapter.StoryAdapter;
import com.example.messenger_people_java.model.Story;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
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
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        refreshAdapter(getAllChats());
    }

    private void refreshAdapter(ArrayList<Story> chats) {
        StoryAdapter adapter = new StoryAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Story> getAllChats() {
        ArrayList<Story> stories = new ArrayList<>();

        stories.add(new Story(R.drawable.story4, R.drawable.add, "Add to Story", "1", true));
        stories.add(new Story(R.drawable.story2, R.drawable.profile_img1, "Gaffarov Jakhongir", "1", false));
        stories.add(new Story(R.drawable.story3, R.drawable.profile_img2, "Gaffarov Jakhongir2", "2", false));
        stories.add(new Story(R.drawable.story1, R.drawable.profile_img3, "Gaffarov Jakhongir3", "3", false));
        stories.add(new Story(R.drawable.story2, R.drawable.profile_img1, "Gaffarov Jakhongir", "1", false));
        stories.add(new Story(R.drawable.story3, R.drawable.profile_img2, "Gaffarov Jakhongir2", "2", false));
        stories.add(new Story(R.drawable.story1, R.drawable.profile_img3, "Gaffarov Jakhongir3", "3", false));
        stories.add(new Story(R.drawable.story2, R.drawable.profile_img1, "Gaffarov Jakhongir", "1", false));
        stories.add(new Story(R.drawable.story3, R.drawable.profile_img2, "Gaffarov Jakhongir2", "2", false));
        stories.add(new Story(R.drawable.story1, R.drawable.profile_img3, "Gaffarov Jakhongir3", "3", false));
        stories.add(new Story(R.drawable.story2, R.drawable.profile_img1, "Gaffarov Jakhongir", "1", false));
        stories.add(new Story(R.drawable.story3, R.drawable.profile_img2, "Gaffarov Jakhongir2", "2", false));
        stories.add(new Story(R.drawable.story1, R.drawable.profile_img3, "Gaffarov Jakhongir3", "3", false));

        return stories;
    }
}
