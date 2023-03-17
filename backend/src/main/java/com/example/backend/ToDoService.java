package com.example.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class ToDoService {
    private final ToDoRepo toDoRepo;

    public List<ToDo> getAllToDos() {
        return toDoRepo.getAllToDos();
    }

    public ToDo addToDo(ToDo newToDo){
        return toDoRepo.addToDo(new ToDo(
                newToDo.description(),
                newToDo.status()));
    }


}
