package org.idempiere.service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.GoalDao;
import org.idempiere.model.Goal;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Goal business operations.
 */
@Service
@Transactional
public class GoalService {

    private final GoalDao goalDao;

    public GoalService(GoalDao goalDao) {
        this.goalDao = goalDao;
    }

    /**
     * Find goal by ID.
     */
    public Optional<Goal> findById(int goalId) {
        try { return Optional.ofNullable(goalDao.gett(goalId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Find goal by name.
     */
    public Optional<Goal> findByName(String name, int clientId) {
        return goalDao.findByName(name, clientId);
    }

    /**
     * Find all goals for a user.
     */
    public List<Goal> findByUser(int userId) {
        return goalDao.findByUser(userId);
    }

    /**
     * Find all goals for a role.
     */
    public List<Goal> findByRole(int roleId) {
        return goalDao.findByRole(roleId);
    }

    /**
     * Find all goals for a measure.
     */
    public List<Goal> findByMeasure(int measureId) {
        return goalDao.findByMeasure(measureId);
    }

    /**
     * Find all summary goals.
     */
    public List<Goal> findSummaryGoals() {
        return goalDao.findSummaryGoals();
    }

    /**
     * Find all goals for a client.
     */
    public List<Goal> findByClient(int clientId) {
        return goalDao.findByClient(clientId);
    }

    /**
     * Find all active goals.
     */
    public List<Goal> findAllActive() {
        return goalDao.findAllActive();
    }

    /**
     * Save a goal.
     */
    public Goal save(Goal goal) {
        if (goal.getPaGoalId() == null || goal.getPaGoalId() == 0) {
            goalDao.insert(goal);
        } else {
            goalDao.update(goal);
        }
        return goal;
    }

    /**
     * Update goal performance.
     */
    public Goal updatePerformance(Goal goal, BigDecimal actualValue) {
        goal.setMeasureActual(actualValue);
        BigDecimal target = goal.getMeasureTarget();
        if (target != null && target.compareTo(BigDecimal.ZERO) != 0) {
            BigDecimal performance = actualValue.divide(target, 4, java.math.RoundingMode.HALF_UP)
                    .multiply(new BigDecimal("100"));
            goal.setGoalPerformance(performance);
        }
        goal.setDateLastRun(java.time.LocalDateTime.now());
        goalDao.update(goal);
        return goal;
    }

    /**
     * Delete a goal.
     */
    public void delete(int goalId) {
        try { goalDao.deleteById(goalId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Count all goals.
     */
    public long count() {
        return goalDao.findAllActive().size();
    }
}
