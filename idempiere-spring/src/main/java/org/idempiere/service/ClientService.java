package org.idempiere.service;

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
        return clientDao.findById(id);
    }

    public List<Client> findAll() {
        return clientDao.findAll();
    }

    public Optional<Client> findByValue(String value) {
        return clientDao.findByValue(value);
    }

    public List<Client> findAllActive() {
        return clientDao.findAllActive();
    }

    public Client save(Client client) {
        if (client.getAdClientId() == null) {
            clientDao.insert(client);
        } else {
            clientDao.update(client);
        }
        return client;
    }

    public void delete(Integer id) {
        clientDao.deleteById(id);
    }

    public boolean exists(Integer id) {
        return clientDao.exists(id);
    }
}
