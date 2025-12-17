package org.idempiere.dao;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.dao.CrudDao;

import org.idempiere.model.WebServiceType;

import java.util.List;
import java.util.Optional;

/**
 * DAO for Web Service Type (WS_WebServiceType) table operations.
 */
@Dao(cache = @Cache(capacity = 500, evictDelay = 3000))
public interface WebServiceDao extends CrudDao<WebServiceType, Integer, SQLBuilder.NSC, WebServiceDao> {

    @Select("SELECT * FROM WS_WebServiceType WHERE Value = :value AND AD_Client_ID = :clientId")
    Optional<WebServiceType> findByValue(String value, int clientId);

    @Select("SELECT * FROM WS_WebServiceType WHERE Name = :name AND AD_Client_ID = :clientId")
    Optional<WebServiceType> findByName(String name, int clientId);

    @Select("SELECT * FROM WS_WebServiceType WHERE WS_WebService_ID = :webServiceId AND IsActive = 'Y' ORDER BY Name")
    List<WebServiceType> findByWebService(int webServiceId);

    @Select("SELECT * FROM WS_WebServiceType WHERE AD_Table_ID = :tableId AND IsActive = 'Y' ORDER BY Name")
    List<WebServiceType> findByTable(int tableId);

    @Select("SELECT * FROM WS_WebServiceType WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<WebServiceType> findByClient(int clientId);
}
