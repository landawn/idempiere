package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Goal;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Goal operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface GoalDao extends CrudDao<Goal, Integer, SQLBuilder.NSC, GoalDao> {

    @Select("SELECT * FROM PA_Goal WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Goal> findByName(String name, int clientId);

    @Select("SELECT * FROM PA_Goal WHERE AD_User_ID = :userId AND IsActive = 'Y' ORDER BY SeqNo")
    List<Goal> findByUser(int userId);

    @Select("SELECT * FROM PA_Goal WHERE AD_Role_ID = :roleId AND IsActive = 'Y' ORDER BY SeqNo")
    List<Goal> findByRole(int roleId);

    @Select("SELECT * FROM PA_Goal WHERE PA_Measure_ID = :measureId AND IsActive = 'Y' ORDER BY Name")
    List<Goal> findByMeasure(int measureId);

    @Select("SELECT * FROM PA_Goal WHERE IsSummary = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Goal> findSummaryGoals();

    @Select("SELECT * FROM PA_Goal WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY SeqNo")
    List<Goal> findByClient(int clientId);

    @Select("SELECT * FROM PA_Goal WHERE IsActive = 'Y' ORDER BY SeqNo")
    List<Goal> findAllActive();
}
