package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.AlertRule;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface AlertRuleDao extends CrudDao<AlertRule, Integer, SQLBuilder.PSC, AlertRuleDao> {

    @Query("SELECT * FROM AD_AlertRule WHERE AD_Alert_ID = :alertId AND IsActive = 'Y' ORDER BY SeqNo")
    List<AlertRule> findByAlert(Integer alertId);
}
