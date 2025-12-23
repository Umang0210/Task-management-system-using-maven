package com.example.tms.service;

import com.example.tms.model.Task;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class TaskService {

    private final Map<Long, Task> tasks = new ConcurrentHashMap<>();

    public List<Task> findAll() {
        return tasks.values()
                .stream()
                .sorted(Comparator.comparingLong(Task::getId))
                .collect(Collectors.toList());
    }

    public Optional<Task> findById(long id) {
        return Optional.ofNullable(tasks.get(id));
    }

    public Task create(Task payload) {
        Task task = new Task(payload.getTitle(), payload.getDescription());
        task.setCompleted(payload.isCompleted());
        tasks.put(task.getId(), task);
        return task;
    }

    public Optional<Task> update(long id, Task payload) {
        Task existing = tasks.get(id);
        if (existing == null) {
            return Optional.empty();
        }

        if (payload.getTitle() != null) {
            existing.setTitle(payload.getTitle());
        }

        if (payload.getDescription() != null) {
            existing.setDescription(payload.getDescription());
        }

        // Toggle completed correctly
        existing.setCompleted(payload.isCompleted());

        return Optional.of(existing);
    }

    public boolean delete(long id) {
        return tasks.remove(id) != null;
    }

    public void deleteAll() {
        tasks.clear();
    }
}
