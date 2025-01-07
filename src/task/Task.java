package task;

import java.io.Serializable;

public abstract class Task implements Serializable{
    private String taskName;
    private String description;
    private String createdDate;
    private String dueDate;
    
    public Task(String taskName, String description, String createdDate, String dueDate){
        this.taskName = taskName;
        this.description = description;
        this.createdDate = createdDate;
        this.dueDate = dueDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getDueDate() {
        return dueDate;
    }
    
    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    
    public abstract String getTaskType();
    
    @Override
    public String toString(){
        return "Tugas: " + taskName + "\nDeskripsi: " + description + "\nDibuat pada: " + createdDate + "\nTenggat Waktu: " + dueDate;
    }
}