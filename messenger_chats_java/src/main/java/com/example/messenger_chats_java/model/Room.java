package com.example.messenger_chats_java.model;

public class Room {
    private int profile;
    private String fullname;
    private boolean isCreate;

    // Constructor
    public Room(int profile, String fullname, boolean isCreate) {
        this.profile = profile;
        this.fullname = fullname;
        this.isCreate = isCreate;
    }

    // Getters and setters
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

    public boolean isCreate() {
        return isCreate;
    }

    public void setCreate(boolean create) {
        isCreate = create;
    }
}

