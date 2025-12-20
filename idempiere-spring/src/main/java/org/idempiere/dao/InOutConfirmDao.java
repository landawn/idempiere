package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.InOutConfirm;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface InOutConfirmDao extends CrudDao<InOutConfirm, Integer, SQLBuilder.NSC, InOutConfirmDao> {

    @Query("SELECT * FROM M_InOutConfirm WHERE M_InOut_ID = :inOutId AND IsActive = 'Y'")
    List<InOutConfirm> findByInOut(Integer inOutId);

    @Query("SELECT * FROM M_InOutConfirm WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId")
    Optional<InOutConfirm> findByDocumentNo(String documentNo, Integer clientId);

    @Query("SELECT * FROM M_InOutConfirm WHERE ConfirmType = :confirmType AND AD_Client_ID = :clientId")
    List<InOutConfirm> findByConfirmType(String confirmType, Integer clientId);

    @Query("SELECT * FROM M_InOutConfirm WHERE DocStatus = :docStatus AND AD_Client_ID = :clientId")
    List<InOutConfirm> findByDocStatus(String docStatus, Integer clientId);

    @Query("SELECT * FROM M_InOutConfirm WHERE IsActive = 'Y' ORDER BY DocumentNo")
    List<InOutConfirm> findAll();
}
