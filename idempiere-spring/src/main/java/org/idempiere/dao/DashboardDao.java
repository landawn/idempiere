package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Dashboard;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Dashboard operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface DashboardDao extends CrudDao<Dashboard, Integer, SQLBuilder.NSC, DashboardDao> {

    @Select("SELECT * FROM PA_DashboardContent WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Dashboard> findByName(String name, int clientId);

    @Select("SELECT * FROM PA_DashboardContent WHERE AD_Role_ID = :roleId AND IsActive = 'Y' ORDER BY Line, Column_No")
    List<Dashboard> findByRole(int roleId);

    @Select("SELECT * FROM PA_DashboardContent WHERE IsShowInDashboard = 'Y' AND IsActive = 'Y' ORDER BY Line, Column_No")
    List<Dashboard> findDashboardContent();

    @Select("SELECT * FROM PA_DashboardContent WHERE IsShowInLogin = 'Y' AND IsActive = 'Y' ORDER BY Line, Column_No")
    List<Dashboard> findLoginContent();

    @Select("SELECT * FROM PA_DashboardContent WHERE PA_Goal_ID = :goalId AND IsActive = 'Y'")
    List<Dashboard> findByGoal(int goalId);

    @Select("SELECT * FROM PA_DashboardContent WHERE AD_Chart_ID = :chartId AND IsActive = 'Y'")
    List<Dashboard> findByChart(int chartId);

    @Select("SELECT * FROM PA_DashboardContent WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Line, Column_No")
    List<Dashboard> findByClient(int clientId);

    @Select("SELECT * FROM PA_DashboardContent WHERE IsActive = 'Y' ORDER BY Line, Column_No")
    List<Dashboard> findAllActive();
}
