package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.CalendarDao;
import org.idempiere.dao.YearDao;
import org.idempiere.dao.PeriodDao;
import org.idempiere.model.Calendar;
import org.idempiere.model.Year;
import org.idempiere.model.Period;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * Service class for Calendar entity operations.
 */
@Service
@Transactional
public class CalendarService {

    private final CalendarDao calendarDao;
    private final YearDao yearDao;
    private final PeriodDao periodDao;

    public CalendarService(CalendarDao calendarDao, YearDao yearDao, PeriodDao periodDao) {
        this.calendarDao = calendarDao;
        this.yearDao = yearDao;
        this.periodDao = periodDao;
    }

    public Optional<Calendar> findById(Integer id) {
        try {
            return Optional.ofNullable(calendarDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<Calendar> findAll() {
        return calendarDao.findAllActive();
    }

    public List<Calendar> findByClient(Integer clientId) {
        return calendarDao.findByClient(clientId);
    }

    public List<Year> findYearsByCalendar(Integer calendarId) {
        return yearDao.findByCalendar(calendarId);
    }

    public List<Period> findPeriodsByYear(Integer yearId) {
        return periodDao.findByYear(yearId);
    }

    public Optional<Period> findPeriodByDate(LocalDateTime dateAcct, Integer calendarId) {
        return periodDao.findByDateAndCalendar(dateAcct, calendarId);
    }

    public Calendar save(Calendar calendar) {
        try {
            if (calendar.getCCalendarId() == null) {
                calendarDao.insert(calendar);
            } else {
                calendarDao.update(calendar);
            }
            return calendar;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Year saveYear(Year year) {
        try {
            if (year.getCYearId() == null) {
                yearDao.insert(year);
            } else {
                yearDao.update(year);
            }
            return year;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Period savePeriod(Period period) {
        try {
            if (period.getCPeriodId() == null) {
                periodDao.insert(period);
            } else {
                periodDao.update(period);
            }
            return period;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Integer id) {
        try {
            calendarDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    public boolean exists(Integer id) {
        try {
            return calendarDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
