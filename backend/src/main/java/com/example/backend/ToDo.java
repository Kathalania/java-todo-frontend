package com.example.backend;

public record ToDo(
        String id,
        String description,
        ToDoStatus status

) {
}
