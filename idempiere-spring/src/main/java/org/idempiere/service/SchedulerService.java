package org.idempiere.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.SchedulerDao;
import org.idempiere.model.Scheduler;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Scheduler business operations.
 */
@Service
@Transactional
public class SchedulerService {

    private final SchedulerDao schedulerDao;

    public SchedulerService(SchedulerDao schedulerDao) {
        this.schedulerDao = schedulerDao;
    }

    /**
     * Find scheduler by ID.
     */
    public Optional<Scheduler> findById(int schedulerId) {
        return schedulerDao.findById(schedulerId);
    }

    /**
     * Find scheduler by name.
     */
    public Optional<Scheduler> findByName(String name, int clientId) {
        return schedulerDao.findByName(name, clientId);
    }

    /**
     * Find all schedulers for a process.
     */
    public List<Scheduler> findByProcess(int processId) {
        return schedulerDao.findByProcess(processId);
    }

    /**
     * Find all schedulers ready to run.
     */
    public List<Scheduler> findReadyToRun() {
        return schedulerDao.findReadyToRun();
    }

    /**
     * Find all schedulers for a client.
     */
    public List<Scheduler> findByClient(int clientId) {
        return schedulerDao.findByClient(clientId);
    }

    /**
     * Find all active schedulers.
     */
    public List<Scheduler> findAllActive() {
        return schedulerDao.findAllActive();
    }

    /**
     * Save a scheduler.
     */
    public Scheduler save(Scheduler scheduler) {
        if (scheduler.getAdSchedulerId() == null || scheduler.getAdSchedulerId() == 0) {
            schedulerDao.insert(scheduler);
        } else {
            schedulerDao.update(scheduler);
        }
        return scheduler;
    }

    /**
     * Update scheduler run information.
     */
    public Scheduler updateRunInfo(Scheduler scheduler, LocalDateTime nextRun) {
        scheduler.setDateLastRun(LocalDateTime.now());
        scheduler.setDateNextRun(nextRun);
        schedulerDao.update(scheduler);
        return scheduler;
    }

    /**
     * Delete a scheduler.
     */
    public void delete(int schedulerId) {
        schedulerDao.deleteById(schedulerId);
    }

    /**
     * Count all schedulers.
     */
    public long count() {
        return schedulerDao.count();
    }
}
