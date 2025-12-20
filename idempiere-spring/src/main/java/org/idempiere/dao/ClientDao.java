package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Client;

/**
 * DAO interface for Client entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface ClientDao extends CrudDao<Client, Integer, SQLBuilder.PSC, ClientDao> {

    /**
     * Find a client by its value (short name/code)
     */
    @Query("SELECT * FROM AD_Client WHERE Value = :value AND IsActive = 'Y'")
    Optional<Client> findByValue(String value);

    /**
     * Find all active clients
     */
    @Query("SELECT * FROM AD_Client WHERE IsActive = 'Y' ORDER BY Name")
    List<Client> findAllActive();

    /**
     * Find client by name
     */
    @Query("SELECT * FROM AD_Client WHERE Name = :name AND IsActive = 'Y'")
    Optional<Client> findByName(String name);
}
