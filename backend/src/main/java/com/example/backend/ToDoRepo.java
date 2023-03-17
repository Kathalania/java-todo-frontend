package com.example.backend;

import org.springframework.stereotype.Repository;

import java.util.List;

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
}
