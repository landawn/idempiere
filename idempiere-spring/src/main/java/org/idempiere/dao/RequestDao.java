package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Request;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Request operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface RequestDao extends CrudDao<Request, Integer, SQLBuilder.PSC, RequestDao> {

    @Query("SELECT * FROM R_Request WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Request> findByDocumentNo(String documentNo, int clientId);

    @Query("SELECT * FROM R_Request WHERE R_RequestType_ID = :requestTypeId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByRequestType(int requestTypeId);

    @Query("SELECT * FROM R_Request WHERE SalesRep_ID = :salesRepId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findBySalesRep(int salesRepId);

    @Query("SELECT * FROM R_Request WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByBPartner(int bPartnerId);

    @Query("SELECT * FROM R_Request WHERE AD_User_ID = :userId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByUser(int userId);

    @Query("SELECT * FROM R_Request WHERE R_Status_ID = :statusId AND IsActive = 'Y' ORDER BY Priority, Created DESC")
    List<Request> findByStatus(int statusId);

    @Query("SELECT * FROM R_Request WHERE C_Project_ID = :projectId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByProject(int projectId);

    @Query("SELECT * FROM R_Request WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByProduct(int productId);

    @Query("SELECT * FROM R_Request WHERE A_Asset_ID = :assetId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByAsset(int assetId);

    @Query("SELECT * FROM R_Request WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY Priority, DateNextAction")
    List<Request> findOpenRequests();

    @Query("SELECT * FROM R_Request WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findByClient(int clientId);

    @Query("SELECT * FROM R_Request WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<Request> findAllActive();
}
