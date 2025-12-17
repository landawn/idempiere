package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.DocType;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Document Type operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface DocTypeDao extends CrudDao<DocType, Integer, SQLBuilder.NSC, DocTypeDao> {

    @Select("SELECT * FROM C_DocType WHERE Name = :name AND IsActive = 'Y'")
    Optional<DocType> findByName(String name);

    @Select("SELECT * FROM C_DocType WHERE AD_Client_ID = :clientId AND AD_Org_ID IN (0, :orgId) AND IsActive = 'Y' ORDER BY Name")
    List<DocType> findByClientAndOrg(int clientId, int orgId);

    @Select("SELECT * FROM C_DocType WHERE DocBaseType = :docBaseType AND AD_Client_ID = :clientId AND AD_Org_ID IN (0, :orgId) AND IsActive = 'Y' ORDER BY IsDefault DESC, Name")
    List<DocType> findByDocBaseType(String docBaseType, int clientId, int orgId);

    @Select("SELECT * FROM C_DocType WHERE DocBaseType = :docBaseType AND IsSOTrx = :isSOTrx AND AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY IsDefault DESC, Name")
    List<DocType> findByDocBaseTypeAndSOTrx(String docBaseType, String isSOTrx, int clientId);

    @Select("SELECT * FROM C_DocType WHERE IsDefault = 'Y' AND DocBaseType = :docBaseType AND AD_Client_ID = :clientId AND AD_Org_ID IN (0, :orgId) AND IsActive = 'Y'")
    Optional<DocType> findDefaultByDocBaseType(String docBaseType, int clientId, int orgId);

    @Select("SELECT * FROM C_DocType WHERE IsActive = 'Y' ORDER BY Name")
    List<DocType> findAllActive();
}
