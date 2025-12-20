package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.MovementDao;
import org.idempiere.dao.MovementLineDao;
import org.idempiere.model.Movement;
import org.idempiere.model.MovementLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Movement entity operations.
 */
@Service
@Transactional
public class MovementService {

    private final MovementDao movementDao;
    private final MovementLineDao movementLineDao;

    public MovementService(MovementDao movementDao, MovementLineDao movementLineDao) {
        this.movementDao = movementDao;
        this.movementLineDao = movementLineDao;
    }

    public Optional<Movement> findById(Integer id) {
        try { return Optional.ofNullable(movementDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Movement> findAll() {
        return movementDao.findAllActive();
    }

    public Optional<Movement> findByDocumentNo(String documentNo, Integer clientId) {
        return movementDao.findByDocumentNo(documentNo, clientId);
    }

    public List<Movement> findByDocStatus(String docStatus, Integer clientId) {
        return movementDao.findByDocStatus(docStatus, clientId);
    }

    public List<MovementLine> findLinesByMovement(Integer movementId) {
        return movementLineDao.findByMovement(movementId);
    }

    public Movement save(Movement movement) {
        try {
            if (movement.getMMovementId() == null) {
                movementDao.insert(movement);
            } else {
                movementDao.update(movement);
            }
            return movement;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public MovementLine saveLine(MovementLine line) {
        try {
            if (line.getMMovementLineId() == null) {
                movementLineDao.insert(line);
            } else {
                movementLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { movementDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return movementDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
