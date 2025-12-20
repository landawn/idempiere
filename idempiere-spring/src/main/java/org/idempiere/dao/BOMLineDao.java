package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.BOMLine;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface BOMLineDao extends CrudDao<BOMLine, Integer, SQLBuilder.PSC, BOMLineDao> {

    @Query("SELECT * FROM M_BOMLine WHERE M_BOM_ID = :bomId AND IsActive = 'Y' ORDER BY Line")
    List<BOMLine> findByBOM(Integer bomId);

    @Query("SELECT * FROM M_BOMLine WHERE M_Product_ID = :productId AND IsActive = 'Y'")
    List<BOMLine> findByProduct(Integer productId);
}
