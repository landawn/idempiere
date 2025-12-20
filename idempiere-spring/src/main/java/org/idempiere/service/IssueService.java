package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.IssueDao;
import org.idempiere.model.Issue;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Issue tracking business operations.
 */
@Service
@Transactional
public class IssueService {

    private final IssueDao issueDao;

    public IssueService(IssueDao issueDao) {
        this.issueDao = issueDao;
    }

    /**
     * Find issue by ID.
     */
    public Optional<Issue> findById(int issueId) {
        try { return Optional.ofNullable(issueDao.gett(issueId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Find issue by name.
     */
    public Optional<Issue> findByName(String name) {
        return issueDao.findByName(name);
    }

    /**
     * Find all issues for an issue project.
     */
    public List<Issue> findByIssueProject(int issueProjectId) {
        return issueDao.findByIssueProject(issueProjectId);
    }

    /**
     * Find all issues for an issue system.
     */
    public List<Issue> findByIssueSystem(int issueSystemId) {
        return issueDao.findByIssueSystem(issueSystemId);
    }

    /**
     * Find all issues for an issue user.
     */
    public List<Issue> findByIssueUser(int issueUserId) {
        return issueDao.findByIssueUser(issueUserId);
    }

    /**
     * Find all unprocessed issues.
     */
    public List<Issue> findUnprocessed() {
        return issueDao.findUnprocessed();
    }

    /**
     * Find all issues by source location.
     */
    public List<Issue> findBySourceLocation(String className, String methodName) {
        return issueDao.findBySourceLocation(className, methodName);
    }

    /**
     * Find all issues for a client.
     */
    public List<Issue> findByClient(int clientId) {
        return issueDao.findByClient(clientId);
    }

    /**
     * Find all active issues.
     */
    public List<Issue> findAllActive() {
        return issueDao.findAllActive();
    }

    /**
     * Save an issue.
     */
    public Issue save(Issue issue) {
        if (issue.getAdIssueId() == null || issue.getAdIssueId() == 0) {
            issueDao.insert(issue);
        } else {
            issueDao.update(issue);
        }
        return issue;
    }

    /**
     * Mark an issue as processed.
     */
    public Issue processIssue(Issue issue) {
        issue.setProcessed("Y");
        issueDao.update(issue);
        return issue;
    }

    /**
     * Delete an issue.
     */
    public void delete(int issueId) {
        try { issueDao.deleteById(issueId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Count all issues.
     */
    public long count() {
        return issueDao.findAllActive().size();
    }
}
