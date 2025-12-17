package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.TableAccess;
import org.idempiere.model.ColumnAccess;
import org.idempiere.model.RecordAccess;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Table Access entity operations.
 */
@Dao(cache = @Cache(capacity = 500, evictDelay = 3000))
public interface AccessDao extends CrudDao<TableAccess, Integer, SQLBuilder.NSC, AccessDao> {

    @Select("SELECT * FROM AD_Table_Access WHERE AD_Role_ID = :roleId AND IsActive = 'Y'")
    List<TableAccess> findTableAccessByRole(int roleId);

    @Select("SELECT * FROM AD_Table_Access WHERE AD_Role_ID = :roleId AND AD_Table_ID = :tableId AND IsActive = 'Y'")
    List<TableAccess> findTableAccessByRoleAndTable(int roleId, int tableId);

    @Select("SELECT * FROM AD_Column_Access WHERE AD_Role_ID = :roleId AND IsActive = 'Y'")
    List<ColumnAccess> findColumnAccessByRole(int roleId);

    @Select("SELECT * FROM AD_Record_Access WHERE AD_Role_ID = :roleId AND IsActive = 'Y'")
    List<RecordAccess> findRecordAccessByRole(int roleId);
}
