package com.example.taskManager.controllers;

import com.example.taskManager.dtos.CreateTaskDTO;
import com.example.taskManager.entites.TaskEnity;
import com.example.taskManager.services.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService=taskService;
    }
    @GetMapping("")
    public ResponseEntity<List<TaskEnity>>getTask(){
        var task=taskService.getTasks();
        return  ResponseEntity.ok(task);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskEnity> getTaskById(@PathVariable("id") Integer id) {
        var task = taskService.getTaskById(id);
        if (task == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(task);
    }




    @PostMapping("")
    public ResponseEntity<TaskEnity>addTask(@RequestBody CreateTaskDTO body){
        var task=taskService.addTask(body.getTitle(),body.getDescription(),body.getDeadline());
        return ResponseEntity.ok(task);
    }
}
