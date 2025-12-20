package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Bank;

/**
 * DAO interface for Bank entity operations.
 */
public interface BankDao extends CrudDao<Bank, Integer, SQLBuilder.PSC, BankDao> {

    @Query("SELECT * FROM C_Bank WHERE Name = :name AND IsActive = 'Y'")
    Optional<Bank> findByName(String name);

    @Query("SELECT * FROM C_Bank WHERE RoutingNo = :routingNo AND IsActive = 'Y'")
    Optional<Bank> findByRoutingNo(String routingNo);

    @Query("SELECT * FROM C_Bank WHERE SwiftCode = :swiftCode AND IsActive = 'Y'")
    Optional<Bank> findBySwiftCode(String swiftCode);

    @Query("SELECT * FROM C_Bank WHERE IsOwnBank = 'Y' AND IsActive = 'Y'")
    List<Bank> findAllOwnBanks();

    @Query("SELECT * FROM C_Bank WHERE IsActive = 'Y' ORDER BY Name")
    List<Bank> findAllActive();

    @Query("SELECT * FROM C_Bank WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Bank> findByClient(Integer clientId);
}
