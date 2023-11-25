package com.example.messenger_people_java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.messenger_people_java.R;
import com.example.messenger_people_java.model.Story;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class StoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_ADD_STORY = 1;
    private static final int TYPE_STORY = 0;

    private Context context;
    private ArrayList<Story> items;

    public StoryAdapter(Context context, ArrayList<Story> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public int getItemViewType(int position) {
        Story story = items.get(position);
        return story.isAdd() ? TYPE_ADD_STORY : TYPE_STORY;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        if (viewType == TYPE_ADD_STORY) {
            View view = inflater.inflate(R.layout.item_add_story, parent, false);
            return new AddStoryViewHolder(view);
        } else {
            View view = inflater.inflate(R.layout.item_story, parent, false);
            return new StoryViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Story story = items.get(position);

        if (holder instanceof AddStoryViewHolder) {
            AddStoryViewHolder addStoryViewHolder = (AddStoryViewHolder) holder;
            addStoryViewHolder.iv_story.setImageResource(story.getStory());
            addStoryViewHolder.iv_profile.setImageResource(story.getProfile());
            addStoryViewHolder.tv_fullname.setText(story.getFullname());
        }

        if (holder instanceof StoryViewHolder) {
            StoryViewHolder storyViewHolder = (StoryViewHolder) holder;
            storyViewHolder.iv_story.setImageResource(story.getStory());
            storyViewHolder.iv_profile.setImageResource(story.getProfile());
            storyViewHolder.tv_fullname.setText(story.getFullname());
            storyViewHolder.tv_count.setText(story.getCount());
        }
    }

    public class AddStoryViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView iv_story;
        ShapeableImageView iv_profile;
        TextView tv_fullname;

        public AddStoryViewHolder(View view) {
            super(view);
            iv_story = view.findViewById(R.id.iv_story);
            iv_profile = view.findViewById(R.id.iv_profile);
            tv_fullname = view.findViewById(R.id.tv_fullname);
        }
    }

    public class StoryViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView iv_story;
        ShapeableImageView iv_profile;
        TextView tv_fullname;
        TextView tv_count;

        public StoryViewHolder(View view) {
            super(view);
            iv_story = view.findViewById(R.id.iv_story);
            iv_profile = view.findViewById(R.id.iv_profile);
            tv_fullname = view.findViewById(R.id.tv_fullname);
            tv_count = view.findViewById(R.id.tv_count);
        }
    }
}

