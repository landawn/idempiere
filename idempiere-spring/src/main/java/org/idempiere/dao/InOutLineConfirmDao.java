package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.InOutLineConfirm;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface InOutLineConfirmDao extends CrudDao<InOutLineConfirm, Integer, SQLBuilder.NSC, InOutLineConfirmDao> {

    @Query("SELECT * FROM M_InOutLineConfirm WHERE M_InOutConfirm_ID = :confirmId ORDER BY Line")
    List<InOutLineConfirm> findByConfirm(Integer confirmId);

    @Query("SELECT * FROM M_InOutLineConfirm WHERE M_InOutLine_ID = :inOutLineId")
    List<InOutLineConfirm> findByInOutLine(Integer inOutLineId);
}
