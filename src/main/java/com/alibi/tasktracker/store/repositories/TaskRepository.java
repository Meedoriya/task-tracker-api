package com.alibi.tasktracker.store.repositories;

import com.alibi.tasktracker.store.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
