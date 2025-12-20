package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.ForecastLine;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface ForecastLineDao extends CrudDao<ForecastLine, Integer, SQLBuilder.NSC, ForecastLineDao> {

    @Query("SELECT * FROM M_ForecastLine WHERE M_Forecast_ID = :forecastId AND IsActive = 'Y'")
    List<ForecastLine> findByForecast(Integer forecastId);

    @Query("SELECT * FROM M_ForecastLine WHERE M_Product_ID = :productId AND IsActive = 'Y'")
    List<ForecastLine> findByProduct(Integer productId);

    @Query("SELECT * FROM M_ForecastLine WHERE C_Period_ID = :periodId AND IsActive = 'Y'")
    List<ForecastLine> findByPeriod(Integer periodId);
}
