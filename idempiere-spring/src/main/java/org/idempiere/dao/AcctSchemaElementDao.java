package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.AcctSchemaElement;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Accounting Schema Element operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface AcctSchemaElementDao extends CrudDao<AcctSchemaElement, Integer, SQLBuilder.NSC, AcctSchemaElementDao> {

    @Select("SELECT * FROM C_AcctSchema_Element WHERE C_AcctSchema_ID = :acctSchemaId AND IsActive = 'Y' ORDER BY SeqNo")
    List<AcctSchemaElement> findByAcctSchema(int acctSchemaId);

    @Select("SELECT * FROM C_AcctSchema_Element WHERE C_AcctSchema_ID = :acctSchemaId AND ElementType = :elementType AND IsActive = 'Y'")
    Optional<AcctSchemaElement> findByAcctSchemaAndElementType(int acctSchemaId, String elementType);

    @Select("SELECT * FROM C_AcctSchema_Element WHERE C_AcctSchema_ID = :acctSchemaId AND IsMandatory = 'Y' AND IsActive = 'Y' ORDER BY SeqNo")
    List<AcctSchemaElement> findMandatoryByAcctSchema(int acctSchemaId);

    @Select("SELECT * FROM C_AcctSchema_Element WHERE C_AcctSchema_ID = :acctSchemaId AND IsBalanced = 'Y' AND IsActive = 'Y' ORDER BY SeqNo")
    List<AcctSchemaElement> findBalancedByAcctSchema(int acctSchemaId);

    @Select("SELECT * FROM C_AcctSchema_Element WHERE IsActive = 'Y' ORDER BY C_AcctSchema_ID, SeqNo")
    List<AcctSchemaElement> findAllActive();
}
