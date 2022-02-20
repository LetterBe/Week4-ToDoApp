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



}
