package com.alibi.tasktracker.api.controllers.helpers;

import com.alibi.tasktracker.api.exceptions.NotFoundException;
import com.alibi.tasktracker.store.entities.ProjectEntity;
import com.alibi.tasktracker.store.repositories.ProjectRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Component
@Transactional
public class ControllerHelper {

    ProjectRepository projectRepository;

    public ProjectEntity getProjectOrThrowException(@PathVariable("project_id") Long projectId) {
        return projectRepository
                .findById(projectId)
                .orElseThrow(() -> new NotFoundException("We didn't find the project with id: " + projectId));
    }
}
