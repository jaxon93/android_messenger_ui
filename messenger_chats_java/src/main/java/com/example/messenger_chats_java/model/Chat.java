package com.example.messenger_chats_java.model;

import java.util.ArrayList;

public class Chat {
    private Message message;
    private ArrayList<Room> rooms;

    // Constructor with Message parameter
    public Chat(Message message) {
        this.message = message;
        this.rooms = new ArrayList<>();
    }

    // Constructor with ArrayList<Room> parameter
    public Chat(ArrayList<Room> rooms) {
        this.message = null;
        this.rooms = rooms;
    }

    // Getters and setters
    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
}

