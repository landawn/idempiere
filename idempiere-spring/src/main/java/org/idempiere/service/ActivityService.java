package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ActivityDao;
import org.idempiere.model.Activity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Activity entity operations.
 */
@Service
@Transactional
public class ActivityService {

    private final ActivityDao activityDao;

    public ActivityService(ActivityDao activityDao) {
        this.activityDao = activityDao;
    }

    public Optional<Activity> findById(Integer id) {
        try { return Optional.ofNullable(activityDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Activity> findAll() {
        return activityDao.findAllActive();
    }

    public List<Activity> findByClient(Integer clientId) {
        return activityDao.findByClient(clientId);
    }

    public Optional<Activity> findByValue(String value, Integer clientId) {
        return activityDao.findByValueAndClient(value, clientId);
    }

    public Activity save(Activity activity) {
        try {
            if (activity.getCActivityId() == null) {
                activityDao.insert(activity);
            } else {
                activityDao.update(activity);
            }
            return activity;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { activityDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return activityDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
