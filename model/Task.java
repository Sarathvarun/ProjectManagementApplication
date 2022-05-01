package model;

import java.util.List;

import model.enums.Status;

public class Task {
    private long id;
    private String name;
    private long startDate;
    private long dueDate;
    private User owner;
    private Role role;
    private List<Task> dependendTasks;
    private Status status;
    
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
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public List<Task> getDependendTasks() {
        return dependendTasks;
    }
    public void setDependendTasks(List<Task> dependendTasks) {
        this.dependendTasks = dependendTasks;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}
