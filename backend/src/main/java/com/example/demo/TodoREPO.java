package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TodoREPO {
    private List<TodoItem> todoItems;

    public TodoREPO(List<TodoItem> todoItems) {
        this.todoItems = todoItems;
    }

    public void addItem(TodoItem todoItem) {
        todoItems.add(todoItem);
    }

    public void deleteItem(String id) {
        todoItems.removeIf(item -> item.getId().matches(id));
    }

    public List<TodoItem> listOfTasks() {
        return todoItems;
    }
}
