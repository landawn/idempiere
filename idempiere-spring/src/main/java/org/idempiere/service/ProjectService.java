package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ProjectDao;
import org.idempiere.dao.ProjectLineDao;
import org.idempiere.dao.ProjectPhaseDao;
import org.idempiere.dao.ProjectTaskDao;
import org.idempiere.model.Project;
import org.idempiere.model.ProjectLine;
import org.idempiere.model.ProjectPhase;
import org.idempiere.model.ProjectTask;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Project entity operations.
 */
@Service
@Transactional
public class ProjectService {

    private final ProjectDao projectDao;
    private final ProjectLineDao projectLineDao;
    private final ProjectPhaseDao projectPhaseDao;
    private final ProjectTaskDao projectTaskDao;

    public ProjectService(ProjectDao projectDao, ProjectLineDao projectLineDao,
                          ProjectPhaseDao projectPhaseDao, ProjectTaskDao projectTaskDao) {
        this.projectDao = projectDao;
        this.projectLineDao = projectLineDao;
        this.projectPhaseDao = projectPhaseDao;
        this.projectTaskDao = projectTaskDao;
    }

    // Project methods
    public Optional<Project> findById(Integer id) {
        try { return Optional.ofNullable(projectDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Project> findAll() {
        return projectDao.findAllActive();
    }

    public Optional<Project> findByValue(String value, Integer clientId) {
        return projectDao.findByValue(value);
    }

    public List<Project> findByBPartner(Integer bpartnerId) {
        return projectDao.findByBPartnerId(bpartnerId);
    }

    public List<Project> findByStatus(String projectStatus, Integer clientId) {
        return projectDao.findByStatus(projectStatus);
    }

    public Project save(Project project) {
        try {
            if (project.getCProjectId() == null) {
                projectDao.insert(project);
            } else {
                projectDao.update(project);
            }
            return project;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // ProjectLine methods
    public List<ProjectLine> findLinesByProject(Integer projectId) {
        return projectLineDao.findByProjectId(projectId);
    }

    public ProjectLine saveLine(ProjectLine line) {
        try {
            if (line.getCProjectLineId() == null) {
                projectLineDao.insert(line);
            } else {
                projectLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // ProjectPhase methods
    public List<ProjectPhase> findPhasesByProject(Integer projectId) {
        return projectPhaseDao.findByProject(projectId);
    }

    public ProjectPhase savePhase(ProjectPhase phase) {
        try {
            if (phase.getCProjectPhaseId() == null) {
                projectPhaseDao.insert(phase);
            } else {
                projectPhaseDao.update(phase);
            }
            return phase;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // ProjectTask methods
    public List<ProjectTask> findTasksByPhase(Integer phaseId) {
        return projectTaskDao.findByPhase(phaseId);
    }

    public ProjectTask saveTask(ProjectTask task) {
        try {
            if (task.getCProjectTaskId() == null) {
                projectTaskDao.insert(task);
            } else {
                projectTaskDao.update(task);
            }
            return task;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { projectDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return projectDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
