package com.example.backend;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ToDoRepository {

    private Map<String, ToDo> toDos = new HashMap<>();
    public List<ToDo> getAllToDos() {
        return new ArrayList<>(toDos.values());
    }
}
