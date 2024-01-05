package com.example.backend;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ToDoServiceTest {

    ToDoRepository toDoRepository = mock(ToDoRepository.class);
    ToDoService toDoService = new ToDoService(toDoRepository);

    @Test
    void getAllToDos() {
        //GIVEN
        ToDo toDo1 = new ToDo();
        ToDo toDo2 = new ToDo();
        List<ToDo> toDos = List.of(toDo1, toDo2);

        //WHEN
        when(toDoRepository.getAllToDos()).thenReturn(toDos);

        List<ToDo> actual = toDoService.getAllToDos();

        //THEN
        List<ToDo> expected = toDos;
        assertEquals(actual,expected);
    }
}