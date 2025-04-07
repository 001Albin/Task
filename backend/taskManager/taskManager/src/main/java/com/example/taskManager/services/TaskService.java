package com.example.taskManager.services;

import com.example.taskManager.entites.TaskEnity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class TaskService {
    private ArrayList<TaskEnity> tasks=new ArrayList<>();
    private int taskId=1;

    public TaskEnity addTask(String title, String description,String deadline){
        TaskEnity task=new TaskEnity();
        task.setId(taskId);
        task.setTitle(title);
        task.setDescription(description);
       // task.setDeadline(new Date(deadline)); //TODO Validate date format
        task.setCompleted(false);
        tasks.add(task);
        taskId++;
        return task;
    }

     public ArrayList<TaskEnity>getTasks(){
        return tasks;
    }
     public TaskEnity getTaskById(int id){
        for(TaskEnity task :tasks){
            if(task.getId()==id){
                return task;
            }
        }
        return null;
    }

}
