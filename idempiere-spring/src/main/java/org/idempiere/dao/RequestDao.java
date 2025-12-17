package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Request;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Request operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface RequestDao extends CrudDao<Request, Integer, SQLBuilder.NSC, RequestDao> {

    @Select("SELECT * FROM R_Request WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Request> findByDocumentNo(String documentNo, int clientId);

    @Select("SELECT * FROM R_Request WHERE R_RequestType_ID = :requestTypeId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByRequestType(int requestTypeId);

    @Select("SELECT * FROM R_Request WHERE SalesRep_ID = :salesRepId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findBySalesRep(int salesRepId);

    @Select("SELECT * FROM R_Request WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByBPartner(int bPartnerId);

    @Select("SELECT * FROM R_Request WHERE AD_User_ID = :userId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByUser(int userId);

    @Select("SELECT * FROM R_Request WHERE R_Status_ID = :statusId AND IsActive = 'Y' ORDER BY Priority, Created DESC")
    List<Request> findByStatus(int statusId);

    @Select("SELECT * FROM R_Request WHERE C_Project_ID = :projectId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByProject(int projectId);

    @Select("SELECT * FROM R_Request WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByProduct(int productId);

    @Select("SELECT * FROM R_Request WHERE A_Asset_ID = :assetId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByAsset(int assetId);

    @Select("SELECT * FROM R_Request WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY Priority, DateNextAction")
    List<Request> findOpenRequests();

    @Select("SELECT * FROM R_Request WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByClient(int clientId);

    @Select("SELECT * FROM R_Request WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findAllActive();
}
