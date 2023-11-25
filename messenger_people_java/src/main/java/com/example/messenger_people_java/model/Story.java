package com.example.messenger_people_java.model;

public class Story {
    private int story;
    private int profile;
    private String fullname;
    private String count;
    private boolean isAdd;

    public Story(int story, int profile, String fullname, String count, boolean isAdd) {
        this.story = story;
        this.profile = profile;
        this.fullname = fullname;
        this.count = count;
        this.isAdd = isAdd;
    }

    public int getStory() {
        return story;
    }

    public void setStory(int story) {
        this.story = story;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public boolean isAdd() {
        return isAdd;
    }

    public void setAdd(boolean add) {
        isAdd = add;
    }
}
