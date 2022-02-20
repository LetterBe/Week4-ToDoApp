package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public List<TodoItem> listOfItems() {
        return todoItems;
    }

    public Optional<TodoItem> listOneItem(String id) {
        for (TodoItem todoId : todoItems) {
            if (todoId.getId() == id) {
                return Optional.of(todoId);
            }
        }
        return null;
    }
}
