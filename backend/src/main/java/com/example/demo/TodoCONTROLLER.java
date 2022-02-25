package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/todos")
public class TodoCONTROLLER {


    private List<String> greetings = Arrays.asList("Hi", "Bom dia");
    private final TodoSERVICE todoSERVICE;

    public TodoCONTROLLER(TodoSERVICE todoSERVICE) {
        this.todoSERVICE = todoSERVICE;
    }

    //This Endpoint is optional. André added it to test his repo.
    @GetMapping(path = "/api/greeting", produces = "text/plain")
    // @RequestMapping(method = RequestMethod.GET)
    public String hello() {
        Random rand = new Random();
        return greetings.get(rand.nextInt(greetings.size()));
    }

    @PostMapping()
    public void addNewItem(@RequestBody TodoItem todoItem ){
        todoSERVICE.addItem(todoItem);
    }

    //This mapping won't work. Check the naming for PathVariable, the other mappings with PathVariable are done right.
    @DeleteMapping("/{taskdelete}")
    public void deleteOneItem(@PathVariable String idItem){
        todoSERVICE.deleteItem(idItem);
    }

    @GetMapping()
    public List<TodoItem> listOfItems(){
        return todoSERVICE.listOfItems();
    }

    @GetMapping("/{idItem}")
    public TodoItem listOneItem(@PathVariable String idItem){
        return todoSERVICE.listOneItem(idItem);
    }

    @PutMapping("/{idItem}")
    public void setTaskDone(@PathVariable String idItem){
         todoSERVICE.setTaskDone(idItem);
        
    }

    // For the future: It's always good to return something, first for tests and second for the frontend.
    // It's best practice to return the changed object. Otherwise good controller :)



}
