package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.PriceListVersion;

/**
 * DAO interface for PriceListVersion entity operations.
 */
public interface PriceListVersionDao extends CrudDao<PriceListVersion, Integer, SQLBuilder.PSC, PriceListVersionDao> {

    @Query("SELECT * FROM M_PriceList_Version WHERE M_PriceList_ID = :priceListId AND IsActive = 'Y' ORDER BY ValidFrom DESC")
    List<PriceListVersion> findByPriceList(Integer priceListId);

    @Query("SELECT * FROM M_PriceList_Version WHERE M_PriceList_ID = :priceListId AND ValidFrom <= :validDate AND IsActive = 'Y' ORDER BY ValidFrom DESC LIMIT 1")
    Optional<PriceListVersion> findValidVersion(Integer priceListId, java.time.LocalDateTime validDate);

    @Query("SELECT * FROM M_PriceList_Version WHERE Name = :name AND M_PriceList_ID = :priceListId")
    Optional<PriceListVersion> findByNameAndPriceList(String name, Integer priceListId);
}
