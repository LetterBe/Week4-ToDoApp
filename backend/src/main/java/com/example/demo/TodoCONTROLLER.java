package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/todo-app")
public class TodoCONTROLLER {

    private List<String> greetings = Arrays.asList("Hi", "Bom dia");
    private final TodoSERVICE todoSERVICE;

    public TodoCONTROLLER(TodoSERVICE todoSERVICE) {
        this.todoSERVICE = todoSERVICE;
    }

    @GetMapping(path = "/api/greeting", produces = "text/plain")
    public String hello() {
        Random rand = new Random();
        return greetings.get(rand.nextInt(greetings.size()));
    }
    @PostMapping()
    public void addNewItem(@RequestBody TodoItem todoItem ){
        todoSERVICE.addItem(todoItem);
    }
    @DeleteMapping("/{id}")
    public void deleteOneItem(@PathVariable String id){
        todoSERVICE.deleteItem(id);
    }
    @GetMapping("/{listoftasks}")
    public List<TodoItem> listOfTasks(){
        return todoSERVICE.listOfTasks();
    }



}
