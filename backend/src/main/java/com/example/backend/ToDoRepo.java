package com.example.backend;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Repository
public class ToDoRepo {
    private final List<ToDo> listToDos;

    public ToDoRepo(List<ToDo> listToDos) {
        this.listToDos = listToDos;
    }

    public List<ToDo> getAllToDos(){
        return listToDos;
    }

    public ToDo addToDo(ToDo newToDo){
        listToDos.add(newToDo);
        return newToDo;
    }

    public Optional<ToDo> getToDoById(String id){
        return listToDos
                .stream()
                .filter(toDo -> toDo.id().equals(id))
                .findFirst();
    }

    public void deleteToDoById(String id){
        ToDo toDoToDelete = getToDoById(id).orElseThrow(NoSuchElementException::new);
        listToDos.remove(toDoToDelete);
    }

    public ToDo editToDoById (String id, ToDo toDoToEdit){
        ToDo toDoToDelete = getToDoById(id).orElseThrow(NoSuchElementException::new);
        listToDos.remove(toDoToDelete);
        listToDos.add(toDoToEdit);
        return toDoToEdit;
    }
}
