package com.example.taskManager.services;

import com.example.taskManager.entites.TaskEnity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@Service
public class TaskService {
    private ArrayList<TaskEnity> tasks=new ArrayList<>();
    private int taskId=1;
    private SimpleDateFormat deadlineFormatter=new SimpleDateFormat("yyyy-MM-dd");

    public TaskEnity addTask(String title, String description,String deadline) throws ParseException {
        TaskEnity task=new TaskEnity();
        task.setId(taskId);
        task.setTitle(title);
        task.setDescription(description);
        task.setDeadline(deadlineFormatter.parse(deadline)); //TODO Validate date format
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
