package org.idempiere.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.RecurringDao;
import org.idempiere.model.Recurring;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Recurring Document business operations.
 */
@Service
@Transactional
public class RecurringService {

    private final RecurringDao recurringDao;

    public RecurringService(RecurringDao recurringDao) {
        this.recurringDao = recurringDao;
    }

    /**
     * Find recurring by ID.
     */
    public Optional<Recurring> findById(int recurringId) {
        return recurringDao.findById(recurringId);
    }

    /**
     * Find recurring by name.
     */
    public Optional<Recurring> findByName(String name, int clientId) {
        return recurringDao.findByName(name, clientId);
    }

    /**
     * Find all recurring for a client.
     */
    public List<Recurring> findByClient(int clientId) {
        return recurringDao.findByClient(clientId);
    }

    /**
     * Find all recurring by type.
     */
    public List<Recurring> findByRecurringType(String recurringType) {
        return recurringDao.findByRecurringType(recurringType);
    }

    /**
     * Find all active recurring documents.
     */
    public List<Recurring> findActiveRecurring() {
        return recurringDao.findActiveRecurring();
    }

    /**
     * Find all recurring documents due for execution.
     */
    public List<Recurring> findDueRecurring() {
        return recurringDao.findDueRecurring();
    }

    /**
     * Find all active recurring documents.
     */
    public List<Recurring> findAllActive() {
        return recurringDao.findAllActive();
    }

    /**
     * Execute a recurring document and update its run counters.
     */
    public void executeRecurring(Recurring recurring) {
        if (recurring.getRunsRemaining() == null || recurring.getRunsRemaining() <= 0) {
            return; // No more runs remaining
        }

        // Decrement runs remaining
        recurring.setRunsRemaining(recurring.getRunsRemaining() - 1);
        recurring.setDateLastRun(LocalDateTime.now());

        // Calculate next run date based on frequency
        if (recurring.getRunsRemaining() > 0) {
            LocalDateTime nextRun = calculateNextRunDate(recurring);
            recurring.setDateNextRun(nextRun);
        }

        recurringDao.update(recurring);
    }

    private LocalDateTime calculateNextRunDate(Recurring recurring) {
        LocalDateTime lastRun = recurring.getDateLastRun();
        if (lastRun == null) {
            lastRun = LocalDateTime.now();
        }

        String frequencyType = recurring.getFrequencyType();
        int frequency = recurring.getFrequency() != null ? recurring.getFrequency() : 1;

        return switch (frequencyType) {
            case "D" -> lastRun.plusDays(frequency);    // Daily
            case "W" -> lastRun.plusWeeks(frequency);   // Weekly
            case "M" -> lastRun.plusMonths(frequency);  // Monthly
            case "Q" -> lastRun.plusMonths(frequency * 3L); // Quarterly
            case "Y" -> lastRun.plusYears(frequency);   // Yearly
            default -> lastRun.plusDays(frequency);
        };
    }

    /**
     * Save a recurring document.
     */
    public Recurring save(Recurring recurring) {
        if (recurring.getCRecurringId() == null || recurring.getCRecurringId() == 0) {
            recurringDao.insert(recurring);
        } else {
            recurringDao.update(recurring);
        }
        return recurring;
    }

    /**
     * Delete a recurring document.
     */
    public void delete(int recurringId) {
        recurringDao.deleteById(recurringId);
    }

    /**
     * Count all recurring documents.
     */
    public long count() {
        return recurringDao.count();
    }
}
