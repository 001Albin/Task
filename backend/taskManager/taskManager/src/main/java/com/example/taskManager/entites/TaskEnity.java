package com.example.taskManager.entites;


import lombok.Data;

import java.util.Date;
@Data
public class TaskEnity {
    private  int id;
    private String title;
    private String description;
    private Date  deadline;
    private boolean completed;
}
