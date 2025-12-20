package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.AttributeInstance;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface AttributeInstanceDao extends CrudDao<AttributeInstance, Integer, SQLBuilder.PSC, AttributeInstanceDao> {

    @Query("SELECT * FROM M_AttributeInstance WHERE M_AttributeSetInstance_ID = :asiId")
    List<AttributeInstance> findByAttributeSetInstance(Integer asiId);

    @Query("SELECT * FROM M_AttributeInstance WHERE M_Attribute_ID = :attributeId")
    List<AttributeInstance> findByAttribute(Integer attributeId);
}
