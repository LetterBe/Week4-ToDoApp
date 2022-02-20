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

    public void deleteItem(String idItem) {
        todoREPO.deleteItem(idItem);
    }

    public List<TodoItem> listOfItems() {
        return todoREPO.listOfItems();
    }

    public TodoItem listOneItem(String idItem) {
        return todoREPO.listOneItem(idItem).orElseThrow();
    }

    public void setTaskDone(String idItem) {
        listOneItem(idItem).setTaskDone(false);
    }
}
