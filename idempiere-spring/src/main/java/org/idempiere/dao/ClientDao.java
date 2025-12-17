package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.Client;

/**
 * DAO interface for Client entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface ClientDao extends CrudDao<Client, Integer, SQLBuilder.NSC, ClientDao> {

    /**
     * Find a client by its value (short name/code)
     */
    @Select("SELECT * FROM AD_Client WHERE Value = :value AND IsActive = 'Y'")
    Optional<Client> findByValue(String value);

    /**
     * Find all active clients
     */
    @Select("SELECT * FROM AD_Client WHERE IsActive = 'Y' ORDER BY Name")
    List<Client> findAllActive();

    /**
     * Find client by name
     */
    @Select("SELECT * FROM AD_Client WHERE Name = :name AND IsActive = 'Y'")
    Optional<Client> findByName(String name);
}
