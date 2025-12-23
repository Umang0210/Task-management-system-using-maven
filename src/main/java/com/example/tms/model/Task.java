package com.example.tms.model;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicLong;

public class Task {
    private static final AtomicLong COUNTER = new AtomicLong(1);

    private final long id;
    private String title;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;

    public Task() {
        this.id = COUNTER.getAndIncrement();
        this.createdAt = LocalDateTime.now();
    }

    public Task(String title, String description) {
        this.id = COUNTER.getAndIncrement();
        this.title = title;
        this.description = description;
        this.createdAt = LocalDateTime.now();
    }

    public long getId() { return id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", title='" + title + '\'' + '}';
    }
}
