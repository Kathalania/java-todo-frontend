package com.example.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor

public class ToDoService {
    private final ToDoRepo toDoRepo;
    private final IdService idService;

    //private final ToDoStatus status;

    public List<ToDo> getAllToDos() {
        return toDoRepo.getAllToDos();
    }

    public ToDo addToDo(ToDo newToDo){
        return toDoRepo.addToDo(new ToDo(
                idService.generateID(),
                newToDo.description(),
                newToDo.status()
        ));
    }

    public ToDo getToDoById(String id){
        return toDoRepo.getToDoById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public void deleteToDoById(String id) {
        toDoRepo.deleteToDoById(id);
    }

    public ToDo editToDoById(String id, ToDo toDoToEdit) {
    return toDoRepo.editToDoById(id, toDoToEdit);
    }
}
