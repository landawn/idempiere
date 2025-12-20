package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Calendar;

/**
 * DAO interface for Calendar entity operations.
 */
public interface CalendarDao extends CrudDao<Calendar, Integer, SQLBuilder.PSC, CalendarDao> {

    @Query("SELECT * FROM C_Calendar WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Calendar> findByNameAndClient(String name, Integer clientId);

    @Query("SELECT * FROM C_Calendar WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Calendar> findByClient(Integer clientId);

    @Query("SELECT * FROM C_Calendar WHERE IsActive = 'Y' ORDER BY Name")
    List<Calendar> findAllActive();
}
