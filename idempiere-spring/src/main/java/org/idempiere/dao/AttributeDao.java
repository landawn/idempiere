package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Attribute;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface AttributeDao extends CrudDao<Attribute, Integer, SQLBuilder.PSC, AttributeDao> {

    @Query("SELECT * FROM M_Attribute WHERE M_AttributeSet_ID = :attributeSetId AND IsActive = 'Y'")
    List<Attribute> findByAttributeSet(Integer attributeSetId);

    @Query("SELECT * FROM M_Attribute WHERE Name = :name AND M_AttributeSet_ID = :attributeSetId AND IsActive = 'Y'")
    Optional<Attribute> findByName(String name, Integer attributeSetId);

    @Query("SELECT * FROM M_Attribute WHERE IsInstanceAttribute = :isInstance AND IsActive = 'Y'")
    List<Attribute> findByInstanceAttribute(String isInstance);
}
