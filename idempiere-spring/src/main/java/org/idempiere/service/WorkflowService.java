package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.WorkflowNodeDao;
import org.idempiere.dao.WorkflowNodeNextDao;
import org.idempiere.dao.WorkflowProcessDao;
import org.idempiere.dao.WorkflowActivityDao;
import org.idempiere.dao.WorkflowResponsibleDao;
import org.idempiere.model.WorkflowNode;
import org.idempiere.model.WorkflowNodeNext;
import org.idempiere.model.WorkflowProcess;
import org.idempiere.model.WorkflowActivity;
import org.idempiere.model.WorkflowResponsible;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Workflow entity operations.
 */
@Service
@Transactional
public class WorkflowService {

    private final WorkflowNodeDao workflowNodeDao;
    private final WorkflowNodeNextDao workflowNodeNextDao;
    private final WorkflowProcessDao workflowProcessDao;
    private final WorkflowActivityDao workflowActivityDao;
    private final WorkflowResponsibleDao workflowResponsibleDao;

    public WorkflowService(WorkflowNodeDao workflowNodeDao, WorkflowNodeNextDao workflowNodeNextDao,
                           WorkflowProcessDao workflowProcessDao, WorkflowActivityDao workflowActivityDao,
                           WorkflowResponsibleDao workflowResponsibleDao) {
        this.workflowNodeDao = workflowNodeDao;
        this.workflowNodeNextDao = workflowNodeNextDao;
        this.workflowProcessDao = workflowProcessDao;
        this.workflowActivityDao = workflowActivityDao;
        this.workflowResponsibleDao = workflowResponsibleDao;
    }

    // WorkflowNode methods
    public Optional<WorkflowNode> findNodeById(Integer id) {
        try { return Optional.ofNullable(workflowNodeDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<WorkflowNode> findNodesByWorkflow(Integer workflowId) {
        return workflowNodeDao.findByWorkflow(workflowId);
    }

    public Optional<WorkflowNode> findNodeByValue(String value, Integer workflowId) {
        return workflowNodeDao.findByValue(value, workflowId);
    }

    public WorkflowNode saveNode(WorkflowNode node) {
        try {
            if (node.getAdWfNodeId() == null) {
                workflowNodeDao.insert(node);
            } else {
                workflowNodeDao.update(node);
            }
            return node;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // WorkflowNodeNext methods
    public List<WorkflowNodeNext> findNodeNextsByNode(Integer nodeId) {
        return workflowNodeNextDao.findByNode(nodeId);
    }

    public WorkflowNodeNext saveNodeNext(WorkflowNodeNext nodeNext) {
        try {
            if (nodeNext.getAdWfNodeNextId() == null) {
                workflowNodeNextDao.insert(nodeNext);
            } else {
                workflowNodeNextDao.update(nodeNext);
            }
            return nodeNext;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // WorkflowProcess methods
    public Optional<WorkflowProcess> findProcessById(Integer id) {
        try { return Optional.ofNullable(workflowProcessDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<WorkflowProcess> findProcessesByWorkflow(Integer workflowId) {
        return workflowProcessDao.findByWorkflow(workflowId);
    }

    public List<WorkflowProcess> findProcessesByRecord(Integer tableId, Integer recordId) {
        return workflowProcessDao.findByRecord(tableId, recordId);
    }

    public List<WorkflowProcess> findProcessesByState(String wfState, Integer clientId) {
        return workflowProcessDao.findByState(wfState, clientId);
    }

    public List<WorkflowProcess> findActiveProcessesByUser(Integer userId) {
        return workflowProcessDao.findActiveByUser(userId);
    }

    public WorkflowProcess saveProcess(WorkflowProcess process) {
        try {
            if (process.getAdWfProcessId() == null) {
                workflowProcessDao.insert(process);
            } else {
                workflowProcessDao.update(process);
            }
            return process;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // WorkflowActivity methods
    public Optional<WorkflowActivity> findActivityById(Integer id) {
        try { return Optional.ofNullable(workflowActivityDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<WorkflowActivity> findActivitiesByProcess(Integer processId) {
        return workflowActivityDao.findByProcess(processId);
    }

    public List<WorkflowActivity> findActiveActivitiesByUser(Integer userId) {
        return workflowActivityDao.findActiveByUser(userId);
    }

    public WorkflowActivity saveActivity(WorkflowActivity activity) {
        try {
            if (activity.getAdWfActivityId() == null) {
                workflowActivityDao.insert(activity);
            } else {
                workflowActivityDao.update(activity);
            }
            return activity;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // WorkflowResponsible methods
    public Optional<WorkflowResponsible> findResponsibleById(Integer id) {
        try { return Optional.ofNullable(workflowResponsibleDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<WorkflowResponsible> findResponsiblesByClient(Integer clientId) {
        return workflowResponsibleDao.findByClient(clientId);
    }

    public Optional<WorkflowResponsible> findResponsibleByName(String name, Integer clientId) {
        return workflowResponsibleDao.findByName(name, clientId);
    }

    public WorkflowResponsible saveResponsible(WorkflowResponsible responsible) {
        try {
            if (responsible.getAdWfResponsibleId() == null) {
                workflowResponsibleDao.insert(responsible);
            } else {
                workflowResponsibleDao.update(responsible);
            }
            return responsible;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }
}
