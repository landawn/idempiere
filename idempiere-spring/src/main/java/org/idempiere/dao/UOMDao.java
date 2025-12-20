package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.UOM;

/**
 * DAO interface for UOM (Unit of Measure) entity operations.
 */
public interface UOMDao extends CrudDao<UOM, Integer, SQLBuilder.PSC, UOMDao> {

    @Query("SELECT * FROM C_UOM WHERE X12DE355 = :x12de355 AND IsActive = 'Y'")
    Optional<UOM> findByX12DE355(String x12de355);

    @Query("SELECT * FROM C_UOM WHERE Name = :name AND IsActive = 'Y'")
    Optional<UOM> findByName(String name);

    @Query("SELECT * FROM C_UOM WHERE IsDefault = 'Y' AND IsActive = 'Y'")
    Optional<UOM> findDefault();

    @Query("SELECT * FROM C_UOM WHERE IsActive = 'Y' ORDER BY Name")
    List<UOM> findAllActive();

    @Query("SELECT * FROM C_UOM WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<UOM> findByClient(Integer clientId);

    @Query("SELECT * FROM C_UOM WHERE IsActive = 'Y' ORDER BY Name")
    List<UOM> findAll();
}
