package com.example.tms;

import com.example.tms.model.Task;
import com.example.tms.service.TaskService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {

    @Test
    void createAndFind() {
        TaskService s = new TaskService();
        Task t = new Task("t1", "desc");
        Task created = s.create(t);
        assertNotNull(created);
        assertTrue(s.findById(created.getId()).isPresent());
        assertEquals("t1", s.findById(created.getId()).get().getTitle());
    }
}
