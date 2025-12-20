package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ClientDao;
import org.idempiere.model.Client;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Client entity operations.
 */
@Service
@Transactional
public class ClientService {

    private final ClientDao clientDao;

    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public Optional<Client> findById(Integer id) {
        try {
            return Optional.ofNullable(clientDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<Client> findAll() {
        return clientDao.findAllActive();
    }

    public Optional<Client> findByValue(String value) {
        return clientDao.findByValue(value);
    }

    public List<Client> findAllActive() {
        return clientDao.findAllActive();
    }

    public Client save(Client client) {
        try {
            if (client.getAdClientId() == null) {
                clientDao.insert(client);
            } else {
                clientDao.update(client);
            }
            return client;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Integer id) {
        try {
            clientDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    public boolean exists(Integer id) {
        try {
            return clientDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
