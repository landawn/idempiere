package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.TableAccess;
import org.idempiere.model.ColumnAccess;
import org.idempiere.model.RecordAccess;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Table Access entity operations.
 */
@Cache(capacity = 500, evictDelay = 3000)
public interface AccessDao extends CrudDao<TableAccess, Integer, SQLBuilder.PSC, AccessDao> {

    @Query("SELECT * FROM AD_Table_Access WHERE AD_Role_ID = :roleId AND IsActive = 'Y'")
    List<TableAccess> findTableAccessByRole(int roleId);

    @Query("SELECT * FROM AD_Table_Access WHERE AD_Role_ID = :roleId AND AD_Table_ID = :tableId AND IsActive = 'Y'")
    List<TableAccess> findTableAccessByRoleAndTable(int roleId, int tableId);

    @Query("SELECT * FROM AD_Column_Access WHERE AD_Role_ID = :roleId AND IsActive = 'Y'")
    List<ColumnAccess> findColumnAccessByRole(int roleId);

    @Query("SELECT * FROM AD_Record_Access WHERE AD_Role_ID = :roleId AND IsActive = 'Y'")
    List<RecordAccess> findRecordAccessByRole(int roleId);
}
