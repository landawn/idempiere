package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Period;

/**
 * DAO interface for Period entity operations.
 */
public interface PeriodDao extends CrudDao<Period, Integer, SQLBuilder.PSC, PeriodDao> {

    @Query("SELECT * FROM C_Period WHERE C_Year_ID = :yearId AND IsActive = 'Y' ORDER BY PeriodNo")
    List<Period> findByYear(Integer yearId);

    @Query("SELECT * FROM C_Period WHERE :dateAcct BETWEEN StartDate AND EndDate AND C_Year_ID IN (SELECT C_Year_ID FROM C_Year WHERE C_Calendar_ID = :calendarId) AND IsActive = 'Y'")
    Optional<Period> findByDateAndCalendar(java.time.LocalDateTime dateAcct, Integer calendarId);

    @Query("SELECT * FROM C_Period WHERE Name = :name AND C_Year_ID = :yearId")
    Optional<Period> findByNameAndYear(String name, Integer yearId);

    @Query("SELECT * FROM C_Period WHERE PeriodType = :periodType AND IsActive = 'Y' ORDER BY StartDate")
    List<Period> findByPeriodType(String periodType);
}
