package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Project;
import org.idempiere.model.ProjectLine;
import org.idempiere.model.ProjectPhase;
import org.idempiere.model.ProjectTask;
import org.idempiere.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Project entity operations.
 */
@RestController
@RequestMapping("/api/projects")
@Tag(name = "Project", description = "Project management APIs")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    @Operation(summary = "Get all projects")
    public ResponseEntity<List<Project>> findAll() {
        return ResponseEntity.ok(projectService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get project by ID")
    public ResponseEntity<Project> findById(@PathVariable Integer id) {
        return projectService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/value/{value}/client/{clientId}")
    @Operation(summary = "Get project by value")
    public ResponseEntity<Project> findByValue(@PathVariable String value, @PathVariable Integer clientId) {
        return projectService.findByValue(value, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/bpartner/{bpartnerId}")
    @Operation(summary = "Get projects by business partner")
    public ResponseEntity<List<Project>> findByBPartner(@PathVariable Integer bpartnerId) {
        return ResponseEntity.ok(projectService.findByBPartner(bpartnerId));
    }

    @GetMapping("/status/{projectStatus}/client/{clientId}")
    @Operation(summary = "Get projects by status")
    public ResponseEntity<List<Project>> findByStatus(@PathVariable String projectStatus, @PathVariable Integer clientId) {
        return ResponseEntity.ok(projectService.findByStatus(projectStatus, clientId));
    }

    @PostMapping
    @Operation(summary = "Create a new project")
    public ResponseEntity<Project> create(@RequestBody Project project) {
        Project saved = projectService.save(project);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing project")
    public ResponseEntity<Project> update(@PathVariable Integer id, @RequestBody Project project) {
        if (!projectService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        project.setCProjectId(id);
        Project updated = projectService.save(project);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a project")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!projectService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        projectService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // ProjectLine endpoints

    @GetMapping("/{projectId}/lines")
    @Operation(summary = "Get all lines for a project")
    public ResponseEntity<List<ProjectLine>> findLinesByProject(@PathVariable Integer projectId) {
        return ResponseEntity.ok(projectService.findLinesByProject(projectId));
    }

    @PostMapping("/{projectId}/lines")
    @Operation(summary = "Add a line to project")
    public ResponseEntity<ProjectLine> createLine(@PathVariable Integer projectId, @RequestBody ProjectLine line) {
        line.setCProjectId(projectId);
        ProjectLine saved = projectService.saveLine(line);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // ProjectPhase endpoints

    @GetMapping("/{projectId}/phases")
    @Operation(summary = "Get all phases for a project")
    public ResponseEntity<List<ProjectPhase>> findPhasesByProject(@PathVariable Integer projectId) {
        return ResponseEntity.ok(projectService.findPhasesByProject(projectId));
    }

    @PostMapping("/{projectId}/phases")
    @Operation(summary = "Add a phase to project")
    public ResponseEntity<ProjectPhase> createPhase(@PathVariable Integer projectId, @RequestBody ProjectPhase phase) {
        phase.setCProjectId(projectId);
        ProjectPhase saved = projectService.savePhase(phase);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // ProjectTask endpoints

    @GetMapping("/phases/{phaseId}/tasks")
    @Operation(summary = "Get all tasks for a phase")
    public ResponseEntity<List<ProjectTask>> findTasksByPhase(@PathVariable Integer phaseId) {
        return ResponseEntity.ok(projectService.findTasksByPhase(phaseId));
    }

    @PostMapping("/phases/{phaseId}/tasks")
    @Operation(summary = "Add a task to phase")
    public ResponseEntity<ProjectTask> createTask(@PathVariable Integer phaseId, @RequestBody ProjectTask task) {
        task.setCProjectPhaseId(phaseId);
        ProjectTask saved = projectService.saveTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
