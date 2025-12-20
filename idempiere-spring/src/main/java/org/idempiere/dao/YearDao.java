package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Year;

/**
 * DAO interface for Year entity operations.
 */
public interface YearDao extends CrudDao<Year, Integer, SQLBuilder.PSC, YearDao> {

    @Query("SELECT * FROM C_Year WHERE C_Calendar_ID = :calendarId AND IsActive = 'Y' ORDER BY FiscalYear DESC")
    List<Year> findByCalendar(Integer calendarId);

    @Query("SELECT * FROM C_Year WHERE FiscalYear = :fiscalYear AND C_Calendar_ID = :calendarId")
    Optional<Year> findByFiscalYearAndCalendar(String fiscalYear, Integer calendarId);
}
