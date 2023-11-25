package com.example.messenger_chats_java.model;

public class Message {
    private int profile;
    private String fullname;
    private boolean isOnline;

    // Constructor
    public Message(int profile, String fullname, boolean isOnline) {
        this.profile = profile;
        this.fullname = fullname;
        this.isOnline = isOnline;
    }

    // Constructor with default value for isOnline
    public Message(int profile, String fullname) {
        this(profile, fullname, false);
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

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}
