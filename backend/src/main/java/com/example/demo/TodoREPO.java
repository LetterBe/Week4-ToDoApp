package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TodoREPO {

    // You should give todoItems a value,  with a new List. Then you don't need a constructor and will not
    // be in danger of a NullPointer.
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
            //IntelliJ should warn you in the next line. == is only for primitive types. There is an option to check if
            //objects are equal.
            if (todoId.getId() == id) {
                return Optional.of(todoId);
            }
        }
        //Since you're already using optionals, don't return a simple null. Better would be an empty optional.
        return null;
    }
}
