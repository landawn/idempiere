package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.AttributeSetInstance;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface AttributeSetInstanceDao extends CrudDao<AttributeSetInstance, Integer, SQLBuilder.PSC, AttributeSetInstanceDao> {

    @Query("SELECT * FROM M_AttributeSetInstance WHERE M_AttributeSet_ID = :attributeSetId AND IsActive = 'Y'")
    List<AttributeSetInstance> findByAttributeSet(Integer attributeSetId);

    @Query("SELECT * FROM M_AttributeSetInstance WHERE SerNo = :serNo AND IsActive = 'Y'")
    Optional<AttributeSetInstance> findBySerialNo(String serNo);

    @Query("SELECT * FROM M_AttributeSetInstance WHERE Lot = :lot AND IsActive = 'Y'")
    List<AttributeSetInstance> findByLot(String lot);
}
