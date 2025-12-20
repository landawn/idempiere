package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Package;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PackageDao extends CrudDao<Package, Integer, SQLBuilder.PSC, PackageDao> {

    @Query("SELECT * FROM M_Package WHERE M_InOut_ID = :inOutId AND IsActive = 'Y'")
    List<Package> findByInOut(Integer inOutId);

    @Query("SELECT * FROM M_Package WHERE M_Shipper_ID = :shipperId AND IsActive = 'Y'")
    List<Package> findByShipper(Integer shipperId);

    @Query("SELECT * FROM M_Package WHERE TrackingNo = :trackingNo")
    Optional<Package> findByTrackingNo(String trackingNo);

    @Query("SELECT * FROM M_Package WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId")
    Optional<Package> findByDocumentNo(String documentNo, Integer clientId);
}
