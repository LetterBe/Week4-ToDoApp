package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoSERVICE {
    private final TodoREPO todoREPO;

    public TodoSERVICE(TodoREPO todoREPO) {
        this.todoREPO = todoREPO;
    }

    public void addItem(TodoItem todoItem) {
        todoREPO.addItem(todoItem);

    }

    public void deleteItem(String id) {
        todoREPO.deleteItem(id);
    }

    public List<TodoItem> listOfTasks() {
        return todoREPO.listOfTasks();
    }
}
