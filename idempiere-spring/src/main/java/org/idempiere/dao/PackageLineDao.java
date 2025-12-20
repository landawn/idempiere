package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.PackageLine;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PackageLineDao extends CrudDao<PackageLine, Integer, SQLBuilder.PSC, PackageLineDao> {

    @Query("SELECT * FROM M_PackageLine WHERE M_Package_ID = :packageId AND IsActive = 'Y' ORDER BY Line")
    List<PackageLine> findByPackage(Integer packageId);

    @Query("SELECT * FROM M_PackageLine WHERE M_InOutLine_ID = :inOutLineId")
    List<PackageLine> findByInOutLine(Integer inOutLineId);
}
