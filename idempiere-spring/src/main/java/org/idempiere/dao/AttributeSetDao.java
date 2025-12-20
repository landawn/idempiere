package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.AttributeSet;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface AttributeSetDao extends CrudDao<AttributeSet, Integer, SQLBuilder.PSC, AttributeSetDao> {

    @Query("SELECT * FROM M_AttributeSet WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<AttributeSet> findByClient(Integer clientId);

    @Query("SELECT * FROM M_AttributeSet WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<AttributeSet> findByName(String name, Integer clientId);

    @Query("SELECT * FROM M_AttributeSet WHERE IsInstanceAttribute = :isInstance AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<AttributeSet> findByInstanceAttribute(String isInstance, Integer clientId);
}
