package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.ProjectPhase;
import org.idempiere.service.ProjectPhaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for ProjectPhase entity operations.
 */
@RestController
@RequestMapping("/api/project-phases")
@Tag(name = "Project Phase", description = "Project phase management APIs")
public class ProjectPhaseController {

    private final ProjectPhaseService projectPhaseService;

    public ProjectPhaseController(ProjectPhaseService projectPhaseService) {
        this.projectPhaseService = projectPhaseService;
    }

    @GetMapping("/project/{projectId}")
    @Operation(summary = "Get all project phases for a project")
    public ResponseEntity<List<ProjectPhase>> getPhasesByProject(@PathVariable Integer projectId) {
        return ResponseEntity.ok(projectPhaseService.getPhasesByProject(projectId));
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get project phase by ID")
    public ResponseEntity<ProjectPhase> findById(@PathVariable Integer id) {
        return projectPhaseService.getPhaseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new project phase")
    public ResponseEntity<ProjectPhase> create(@RequestBody ProjectPhase projectPhase) {
        ProjectPhase saved = projectPhaseService.createPhase(projectPhase);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing project phase")
    public ResponseEntity<ProjectPhase> update(@PathVariable Integer id, @RequestBody ProjectPhase projectPhase) {
        if (!projectPhaseService.getPhaseById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        projectPhase.setCProjectPhaseId(id);
        ProjectPhase updated = projectPhaseService.updatePhase(projectPhase);
        return ResponseEntity.ok(updated);
    }

    @PostMapping("/{id}/complete")
    @Operation(summary = "Complete a project phase")
    public ResponseEntity<ProjectPhase> complete(@PathVariable Integer id) {
        ProjectPhase completed = projectPhaseService.completePhase(id);
        if (completed == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(completed);
    }
}
