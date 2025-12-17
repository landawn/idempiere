package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.RequestType;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Request Type operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface RequestTypeDao extends CrudDao<RequestType, Integer, SQLBuilder.NSC, RequestTypeDao> {

    @Select("SELECT * FROM R_RequestType WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<RequestType> findByName(String name, int clientId);

    @Select("SELECT * FROM R_RequestType WHERE IsDefault = 'Y' AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<RequestType> findDefault(int clientId);

    @Select("SELECT * FROM R_RequestType WHERE R_StatusCategory_ID = :statusCategoryId AND IsActive = 'Y' ORDER BY Name")
    List<RequestType> findByStatusCategory(int statusCategoryId);

    @Select("SELECT * FROM R_RequestType WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<RequestType> findByClient(int clientId);

    @Select("SELECT * FROM R_RequestType WHERE IsActive = 'Y' ORDER BY Name")
    List<RequestType> findAllActive();
}
