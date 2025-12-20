package org.idempiere.service;

import java.sql.SQLException;
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
        try { return Optional.ofNullable(projectPhaseDao.gett(phaseId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
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
        try {
            projectPhaseDao.insert(phase);
            return phase;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create phase", e);
        }
    }

    /**
     * Update a project phase.
     */
    public ProjectPhase updatePhase(ProjectPhase phase) {
        try {
            projectPhaseDao.update(phase);
            return phase;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to update phase", e);
        }
    }

    /**
     * Complete a project phase.
     */
    public ProjectPhase completePhase(int phaseId) {
        try {
            ProjectPhase phase = projectPhaseDao.gett(phaseId);
            if (phase != null) {
                phase.setIsComplete("Y");
                projectPhaseDao.update(phase);
                return phase;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to complete phase", e);
        }
    }

    /**
     * Get task by ID.
     */
    public Optional<ProjectTask> getTaskById(int taskId) {
        try { return Optional.ofNullable(projectTaskDao.gett(taskId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
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
        try {
            projectTaskDao.insert(task);
            return task;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create task", e);
        }
    }

    /**
     * Update a project task.
     */
    public ProjectTask updateTask(ProjectTask task) {
        try {
            projectTaskDao.update(task);
            return task;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to update task", e);
        }
    }

    /**
     * Complete a project task.
     */
    public ProjectTask completeTask(int taskId) {
        try {
            ProjectTask task = projectTaskDao.gett(taskId);
            if (task != null) {
                task.setStatus("C");
                projectTaskDao.update(task);
                return task;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to complete task", e);
        }
    }
}
