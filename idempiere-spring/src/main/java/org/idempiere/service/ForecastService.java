package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ForecastDao;
import org.idempiere.dao.ForecastLineDao;
import org.idempiere.model.Forecast;
import org.idempiere.model.ForecastLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Forecast entity operations.
 */
@Service
@Transactional
public class ForecastService {

    private final ForecastDao forecastDao;
    private final ForecastLineDao forecastLineDao;

    public ForecastService(ForecastDao forecastDao, ForecastLineDao forecastLineDao) {
        this.forecastDao = forecastDao;
        this.forecastLineDao = forecastLineDao;
    }

    public Optional<Forecast> findById(Integer id) {
        try {
            return Optional.ofNullable(forecastDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<Forecast> findAll() {
        return forecastDao.findAll();
    }

    public List<Forecast> findByClient(Integer clientId) {
        return forecastDao.findByClient(clientId);
    }

    public Optional<Forecast> findByName(String name, Integer clientId) {
        return forecastDao.findByName(name, clientId);
    }

    public Optional<Forecast> findDefault(Integer clientId) {
        return forecastDao.findDefault(clientId);
    }

    public List<Forecast> findByCalendar(Integer calendarId) {
        return forecastDao.findByCalendar(calendarId);
    }

    public Forecast save(Forecast forecast) {
        try {
            if (forecast.getMForecastId() == null) {
                forecastDao.insert(forecast);
            } else {
                forecastDao.update(forecast);
            }
            return forecast;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save forecast", e);
        }
    }

    // ForecastLine methods
    public List<ForecastLine> findLinesByForecast(Integer forecastId) {
        return forecastLineDao.findByForecast(forecastId);
    }

    public List<ForecastLine> findLinesByProduct(Integer productId) {
        return forecastLineDao.findByProduct(productId);
    }

    public List<ForecastLine> findLinesByPeriod(Integer periodId) {
        return forecastLineDao.findByPeriod(periodId);
    }

    public ForecastLine saveLine(ForecastLine line) {
        try {
            if (line.getMForecastLineId() == null) {
                forecastLineDao.insert(line);
            } else {
                forecastLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save forecast line", e);
        }
    }

    public void delete(Integer id) {
        try {
            forecastDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    public boolean exists(Integer id) {
        try {
            return forecastDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
