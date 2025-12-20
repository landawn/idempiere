package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.PaymentTerm;

/**
 * DAO interface for PaymentTerm entity operations.
 */
public interface PaymentTermDao extends CrudDao<PaymentTerm, Integer, SQLBuilder.PSC, PaymentTermDao> {

    @Query("SELECT * FROM C_PaymentTerm WHERE IsActive = 'Y' ORDER BY Name")
    List<PaymentTerm> findAllActive();

    @Query("SELECT * FROM C_PaymentTerm WHERE Value = :value AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<PaymentTerm> findByValueAndClient(String value, Integer clientId);

    @Query("SELECT * FROM C_PaymentTerm WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<PaymentTerm> findByNameAndClient(String name, Integer clientId);

    @Query("SELECT * FROM C_PaymentTerm WHERE IsDefault = 'Y' AND AD_Client_ID = :clientId")
    Optional<PaymentTerm> findDefault(Integer clientId);

    @Query("SELECT * FROM C_PaymentTerm WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<PaymentTerm> findByClient(Integer clientId);
}
