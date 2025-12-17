package org.idempiere.dao;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.dao.CrudDao;

import org.idempiere.model.ImportProcessor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * DAO for Import Processor (IMP_Processor) table operations.
 */
@Dao(cache = @Cache(capacity = 500, evictDelay = 3000))
public interface ImportProcessorDao extends CrudDao<ImportProcessor, Integer, SQLBuilder.NSC, ImportProcessorDao> {

    @Select("SELECT * FROM IMP_Processor WHERE Value = :value AND AD_Client_ID = :clientId")
    Optional<ImportProcessor> findByValue(String value, int clientId);

    @Select("SELECT * FROM IMP_Processor WHERE Name = :name AND AD_Client_ID = :clientId")
    Optional<ImportProcessor> findByName(String name, int clientId);

    @Select("SELECT * FROM IMP_Processor WHERE IMP_Processor_Type_ID = :processorTypeId AND IsActive = 'Y' ORDER BY Name")
    List<ImportProcessor> findByType(int processorTypeId);

    @Select("SELECT * FROM IMP_Processor WHERE IsActive = 'Y' AND DateNextRun <= :now ORDER BY DateNextRun")
    List<ImportProcessor> findDueForRun(LocalDateTime now);

    @Select("SELECT * FROM IMP_Processor WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<ImportProcessor> findByClient(int clientId);
}
