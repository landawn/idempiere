package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.DocType;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Document Type operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface DocTypeDao extends CrudDao<DocType, Integer, SQLBuilder.PSC, DocTypeDao> {

    @Query("SELECT * FROM C_DocType WHERE Name = :name AND IsActive = 'Y'")
    Optional<DocType> findByName(String name);

    @Query("SELECT * FROM C_DocType WHERE AD_Client_ID = :clientId AND AD_Org_ID IN (0, :orgId) AND IsActive = 'Y' ORDER BY Name")
    List<DocType> findByClientAndOrg(int clientId, int orgId);

    @Query("SELECT * FROM C_DocType WHERE DocBaseType = :docBaseType AND AD_Client_ID = :clientId AND AD_Org_ID IN (0, :orgId) AND IsActive = 'Y' ORDER BY IsDefault DESC, Name")
    List<DocType> findByDocBaseType(String docBaseType, int clientId, int orgId);

    @Query("SELECT * FROM C_DocType WHERE DocBaseType = :docBaseType AND IsSOTrx = :isSOTrx AND AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY IsDefault DESC, Name")
    List<DocType> findByDocBaseTypeAndSOTrx(String docBaseType, String isSOTrx, int clientId);

    @Query("SELECT * FROM C_DocType WHERE IsDefault = 'Y' AND DocBaseType = :docBaseType AND AD_Client_ID = :clientId AND AD_Org_ID IN (0, :orgId) AND IsActive = 'Y'")
    Optional<DocType> findDefaultByDocBaseType(String docBaseType, int clientId, int orgId);

    @Query("SELECT * FROM C_DocType WHERE IsActive = 'Y' ORDER BY Name")
    List<DocType> findAllActive();

    @Query("SELECT * FROM C_DocType WHERE IsActive = 'Y' ORDER BY Name")
    List<DocType> findAll();
}
