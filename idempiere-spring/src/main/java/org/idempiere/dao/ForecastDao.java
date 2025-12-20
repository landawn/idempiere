package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Forecast;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface ForecastDao extends CrudDao<Forecast, Integer, SQLBuilder.NSC, ForecastDao> {

    @Query("SELECT * FROM M_Forecast WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<Forecast> findByClient(Integer clientId);

    @Query("SELECT * FROM M_Forecast WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Forecast> findByName(String name, Integer clientId);

    @Query("SELECT * FROM M_Forecast WHERE IsDefault = 'Y' AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Forecast> findDefault(Integer clientId);

    @Query("SELECT * FROM M_Forecast WHERE C_Calendar_ID = :calendarId AND IsActive = 'Y'")
    List<Forecast> findByCalendar(Integer calendarId);

    @Query("SELECT * FROM M_Forecast WHERE IsActive = 'Y' ORDER BY Name")
    List<Forecast> findAll();
}
