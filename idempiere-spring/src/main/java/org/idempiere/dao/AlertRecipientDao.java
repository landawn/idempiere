package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.AlertRecipient;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface AlertRecipientDao extends CrudDao<AlertRecipient, Integer, SQLBuilder.PSC, AlertRecipientDao> {

    @Query("SELECT * FROM AD_AlertRecipient WHERE AD_Alert_ID = :alertId AND IsActive = 'Y'")
    List<AlertRecipient> findByAlert(Integer alertId);

    @Query("SELECT * FROM AD_AlertRecipient WHERE AD_User_ID = :userId AND IsActive = 'Y'")
    List<AlertRecipient> findByUser(Integer userId);

    @Query("SELECT * FROM AD_AlertRecipient WHERE AD_Role_ID = :roleId AND IsActive = 'Y'")
    List<AlertRecipient> findByRole(Integer roleId);
}
