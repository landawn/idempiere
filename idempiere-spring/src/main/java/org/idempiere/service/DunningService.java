package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.DunningDao;
import org.idempiere.dao.DunningLevelDao;
import org.idempiere.dao.DunningRunDao;
import org.idempiere.model.Dunning;
import org.idempiere.model.DunningLevel;
import org.idempiere.model.DunningRun;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Dunning entity operations.
 */
@Service
@Transactional
public class DunningService {

    private final DunningDao dunningDao;
    private final DunningLevelDao dunningLevelDao;
    private final DunningRunDao dunningRunDao;

    public DunningService(DunningDao dunningDao, DunningLevelDao dunningLevelDao, DunningRunDao dunningRunDao) {
        this.dunningDao = dunningDao;
        this.dunningLevelDao = dunningLevelDao;
        this.dunningRunDao = dunningRunDao;
    }

    public Optional<Dunning> findById(Integer id) {
        try {
            return Optional.ofNullable(dunningDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<Dunning> findAll() {
        return dunningDao.findAll();
    }

    public List<Dunning> findByClient(Integer clientId) {
        return dunningDao.findByClient(clientId);
    }

    public List<DunningLevel> findLevelsByDunning(Integer dunningId) {
        return dunningLevelDao.findByDunning(dunningId);
    }

    public List<DunningRun> findRunsByDunning(Integer dunningId) {
        return dunningRunDao.findByDunning(dunningId);
    }

    public Dunning save(Dunning dunning) {
        try {
            if (dunning.getCDunningId() == null) {
                dunningDao.insert(dunning);
            } else {
                dunningDao.update(dunning);
            }
            return dunning;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save dunning", e);
        }
    }

    public DunningLevel saveLevel(DunningLevel level) {
        try {
            if (level.getCDunningLevelId() == null) {
                dunningLevelDao.insert(level);
            } else {
                dunningLevelDao.update(level);
            }
            return level;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save dunning level", e);
        }
    }

    public DunningRun saveRun(DunningRun run) {
        try {
            if (run.getCDunningRunId() == null) {
                dunningRunDao.insert(run);
            } else {
                dunningRunDao.update(run);
            }
            return run;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save dunning run", e);
        }
    }

    public void delete(Integer id) {
        try {
            dunningDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    public boolean exists(Integer id) {
        try {
            return dunningDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
