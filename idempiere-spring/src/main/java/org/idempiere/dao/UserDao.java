package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.User;

/**
 * DAO interface for User entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface UserDao extends CrudDao<User, Integer, SQLBuilder.PSC, UserDao> {

    /**
     * Find a user by email
     */
    @Query("SELECT * FROM AD_User WHERE Email = :email AND IsActive = 'Y'")
    Optional<User> findByEmail(String email);

    /**
     * Find a user by name
     */
    @Query("SELECT * FROM AD_User WHERE Name = :name AND IsActive = 'Y'")
    Optional<User> findByName(String name);

    /**
     * Find a user by value (login name)
     */
    @Query("SELECT * FROM AD_User WHERE Value = :value AND IsActive = 'Y'")
    Optional<User> findByValue(String value);

    /**
     * Find all users for a specific business partner
     */
    @Query("SELECT * FROM AD_User WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY Name")
    List<User> findByBPartnerId(Integer bPartnerId);

    /**
     * Find all active users for a client
     */
    @Query("SELECT * FROM AD_User WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<User> findByClientId(Integer clientId);

    /**
     * Find all sales representatives
     */
    @Query("SELECT u.* FROM AD_User u " +
            "INNER JOIN C_BPartner bp ON u.C_BPartner_ID = bp.C_BPartner_ID " +
            "WHERE bp.IsSalesRep = 'Y' AND u.IsActive = 'Y' " +
            "ORDER BY u.Name")
    List<User> findAllSalesReps();

    /**
     * Find users who are not locked
     */
    @Query("SELECT * FROM AD_User WHERE IsLocked = 'N' AND IsActive = 'Y' ORDER BY Name")
    List<User> findAllUnlocked();

    /**
     * Find all users (including inactive)
     */
    @Query("SELECT * FROM AD_User ORDER BY Name")
    List<User> findAll();

    /**
     * Find all active users
     */
    @Query("SELECT * FROM AD_User WHERE IsActive = 'Y' ORDER BY Name")
    List<User> findAllActive();

    /**
     * Authenticate user by name and password
     */
    @Query("SELECT * FROM AD_User WHERE Name = :name AND Password = :password AND IsActive = 'Y'")
    Optional<User> findByNameAndPassword(String name, String password);
}
