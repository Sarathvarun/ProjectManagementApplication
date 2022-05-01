package model;

import java.util.List;

import model.enums.Status;

public class Project {
    private long id;
    private String name;
    private long startDate;
    private long dueDate;
    private User owner;
    private List<User> associatedUsers;
    private Status status;
    private List<Task> tasks;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getStartDate() {
        return startDate;
    }
    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }
    public long getDueDate() {
        return dueDate;
    }
    public void setDueDate(long dueDate) {
        this.dueDate = dueDate;
    }
    public User getOwner() {
        return owner;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }
    public List<User> getAssociatedUsers() {
        return associatedUsers;
    }
    public void setAssociatedUsers(List<User> associatedUsers) {
        this.associatedUsers = associatedUsers;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    
    
}