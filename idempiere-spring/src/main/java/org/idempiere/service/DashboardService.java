package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.DashboardDao;
import org.idempiere.model.Dashboard;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Dashboard business operations.
 */
@Service
@Transactional
public class DashboardService {

    private final DashboardDao dashboardDao;

    public DashboardService(DashboardDao dashboardDao) {
        this.dashboardDao = dashboardDao;
    }

    /**
     * Find dashboard content by ID.
     */
    public Optional<Dashboard> findById(int dashboardId) {
        return dashboardDao.findById(dashboardId);
    }

    /**
     * Find dashboard content by name.
     */
    public Optional<Dashboard> findByName(String name, int clientId) {
        return dashboardDao.findByName(name, clientId);
    }

    /**
     * Find all dashboard content for a role.
     */
    public List<Dashboard> findByRole(int roleId) {
        return dashboardDao.findByRole(roleId);
    }

    /**
     * Find all dashboard content (for dashboard display).
     */
    public List<Dashboard> findDashboardContent() {
        return dashboardDao.findDashboardContent();
    }

    /**
     * Find all login content (for login display).
     */
    public List<Dashboard> findLoginContent() {
        return dashboardDao.findLoginContent();
    }

    /**
     * Find all dashboard content for a goal.
     */
    public List<Dashboard> findByGoal(int goalId) {
        return dashboardDao.findByGoal(goalId);
    }

    /**
     * Find all dashboard content for a chart.
     */
    public List<Dashboard> findByChart(int chartId) {
        return dashboardDao.findByChart(chartId);
    }

    /**
     * Find all dashboard content for a client.
     */
    public List<Dashboard> findByClient(int clientId) {
        return dashboardDao.findByClient(clientId);
    }

    /**
     * Find all active dashboard content.
     */
    public List<Dashboard> findAllActive() {
        return dashboardDao.findAllActive();
    }

    /**
     * Save dashboard content.
     */
    public Dashboard save(Dashboard dashboard) {
        if (dashboard.getPaDashboardContentId() == null || dashboard.getPaDashboardContentId() == 0) {
            dashboardDao.insert(dashboard);
        } else {
            dashboardDao.update(dashboard);
        }
        return dashboard;
    }

    /**
     * Delete dashboard content.
     */
    public void delete(int dashboardId) {
        dashboardDao.deleteById(dashboardId);
    }

    /**
     * Count all dashboard content.
     */
    public long count() {
        return dashboardDao.count();
    }
}
