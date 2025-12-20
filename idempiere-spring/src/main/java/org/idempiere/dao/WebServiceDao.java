package org.idempiere.dao;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.dao.CrudDao;

import org.idempiere.model.WebServiceType;

import java.util.List;
import java.util.Optional;

/**
 * DAO for Web Service Type (WS_WebServiceType) table operations.
 */
@Cache(capacity = 500, evictDelay = 3000)
public interface WebServiceDao extends CrudDao<WebServiceType, Integer, SQLBuilder.PSC, WebServiceDao> {

    @Query("SELECT * FROM WS_WebServiceType WHERE Value = :value AND AD_Client_ID = :clientId")
    Optional<WebServiceType> findByValue(String value, int clientId);

    @Query("SELECT * FROM WS_WebServiceType WHERE Name = :name AND AD_Client_ID = :clientId")
    Optional<WebServiceType> findByName(String name, int clientId);

    @Query("SELECT * FROM WS_WebServiceType WHERE WS_WebService_ID = :webServiceId AND IsActive = 'Y' ORDER BY Name")
    List<WebServiceType> findByWebService(int webServiceId);

    @Query("SELECT * FROM WS_WebServiceType WHERE AD_Table_ID = :tableId AND IsActive = 'Y' ORDER BY Name")
    List<WebServiceType> findByTable(int tableId);

    @Query("SELECT * FROM WS_WebServiceType WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<WebServiceType> findByClient(int clientId);
}
