package com.example.demo;

public class TodoItem {
    private String id;
    private String task;
    private boolean taskDone;

    public TodoItem() {
    }

    public TodoItem(String id, String task, boolean taskDone) {
        this.id = id;
        this.task = task;
        this.taskDone = taskDone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isTaskDone (){
        return taskDone;
    }

    public void setTaskDone(boolean taskDone) {
        this.taskDone = taskDone;
    }

    @Override
    public String toString() {
        return task;
    }
}

