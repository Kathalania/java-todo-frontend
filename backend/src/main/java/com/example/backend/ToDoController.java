package com.example.backend;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todo")
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    @GetMapping
    public List<ToDo> getToDo(){
        return toDoService.getAllToDos();
    }

    @PostMapping
    public ToDo addToDo(@RequestBody ToDo newToDo){
        return toDoService.addToDo(newToDo);
    }

    @GetMapping("{id}")
    public ToDo getToDoById(@PathVariable String id){
        return toDoService.getToDoById(id);
    }

    @DeleteMapping("{id}")
    public void deleteToDoById(@PathVariable String id){
        toDoService.deleteToDoById(id);
    }

    @PutMapping("{id}")
    public ToDo editToDo (@PathVariable String id, @RequestBody ToDo toDoToEdit){
        return toDoService.editToDoById(id, toDoToEdit);
    }


}
