package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ProjectPhaseDao;
import org.idempiere.dao.ProjectTaskDao;
import org.idempiere.model.ProjectPhase;
import org.idempiere.model.ProjectTask;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Project Phase and Task operations.
 */
@Service
@Transactional
public class ProjectPhaseService {

    private final ProjectPhaseDao projectPhaseDao;
    private final ProjectTaskDao projectTaskDao;

    public ProjectPhaseService(ProjectPhaseDao projectPhaseDao, ProjectTaskDao projectTaskDao) {
        this.projectPhaseDao = projectPhaseDao;
        this.projectTaskDao = projectTaskDao;
    }

    /**
     * Get phase by ID.
     */
    public Optional<ProjectPhase> getPhaseById(int phaseId) {
        return projectPhaseDao.findById(phaseId);
    }

    /**
     * Get all phases for a project.
     */
    public List<ProjectPhase> getPhasesByProject(int projectId) {
        return projectPhaseDao.findByProject(projectId);
    }

    /**
     * Get incomplete phases for a project.
     */
    public List<ProjectPhase> getIncompletePhases(int projectId) {
        return projectPhaseDao.findIncompleteByProject(projectId);
    }

    /**
     * Create a new project phase.
     */
    public ProjectPhase createPhase(ProjectPhase phase) {
        projectPhaseDao.insert(phase);
        return phase;
    }

    /**
     * Update a project phase.
     */
    public ProjectPhase updatePhase(ProjectPhase phase) {
        projectPhaseDao.update(phase);
        return phase;
    }

    /**
     * Complete a project phase.
     */
    public ProjectPhase completePhase(int phaseId) {
        Optional<ProjectPhase> optPhase = projectPhaseDao.findById(phaseId);
        if (optPhase.isPresent()) {
            ProjectPhase phase = optPhase.get();
            phase.setIsComplete("Y");
            phase.setProcessed("Y");
            projectPhaseDao.update(phase);
            return phase;
        }
        return null;
    }

    /**
     * Get task by ID.
     */
    public Optional<ProjectTask> getTaskById(int taskId) {
        return projectTaskDao.findById(taskId);
    }

    /**
     * Get all tasks for a phase.
     */
    public List<ProjectTask> getTasksByPhase(int phaseId) {
        return projectTaskDao.findByPhase(phaseId);
    }

    /**
     * Get incomplete tasks for a phase.
     */
    public List<ProjectTask> getIncompleteTasks(int phaseId) {
        return projectTaskDao.findIncompleteByPhase(phaseId);
    }

    /**
     * Get milestones for a phase.
     */
    public List<ProjectTask> getMilestones(int phaseId) {
        return projectTaskDao.findMilestonesByPhase(phaseId);
    }

    /**
     * Create a new project task.
     */
    public ProjectTask createTask(ProjectTask task) {
        projectTaskDao.insert(task);
        return task;
    }

    /**
     * Update a project task.
     */
    public ProjectTask updateTask(ProjectTask task) {
        projectTaskDao.update(task);
        return task;
    }

    /**
     * Complete a project task.
     */
    public ProjectTask completeTask(int taskId) {
        Optional<ProjectTask> optTask = projectTaskDao.findById(taskId);
        if (optTask.isPresent()) {
            ProjectTask task = optTask.get();
            task.setIsComplete("Y");
            task.setProjectTaskStatus("C");
            task.setDateFinish(java.time.LocalDate.now());
            task.setProcessed("Y");
            projectTaskDao.update(task);
            return task;
        }
        return null;
    }
}
