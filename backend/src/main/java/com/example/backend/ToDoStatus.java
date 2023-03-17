package com.example.backend;

public enum ToDoStatus {

    OPEN("OPEN");

    private String statusNote;


    private ToDoStatus(String statusNote) {
        this.statusNote = statusNote;
    }

    public String getStatus() {
        return statusNote;
    }
}
