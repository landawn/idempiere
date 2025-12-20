package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.UserDao;
import org.idempiere.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for User entity operations.
 */
@Service
@Transactional
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public Optional<User> findById(Integer id) {
        try { return Optional.ofNullable(userDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public Optional<User> findByName(String name) {
        return userDao.findByName(name);
    }

    public Optional<User> findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    public List<User> findByClientId(Integer clientId) {
        return userDao.findByClientId(clientId);
    }

    public List<User> findByBPartnerId(Integer bPartnerId) {
        return userDao.findByBPartnerId(bPartnerId);
    }

    public List<User> findAllActive() {
        return userDao.findAllActive();
    }

    public Optional<User> authenticate(String name, String password) {
        return userDao.findByNameAndPassword(name, password);
    }

    public User save(User user) {
        try {
            if (user.getAdUserId() == null) {
                userDao.insert(user);
            } else {
                userDao.update(user);
            }
            return user;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { userDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return userDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
