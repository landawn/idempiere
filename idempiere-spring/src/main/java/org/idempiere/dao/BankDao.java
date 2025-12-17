package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.Bank;

/**
 * DAO interface for Bank entity operations.
 */
public interface BankDao extends CrudDao<Bank, Integer, SQLBuilder.NSC, BankDao> {

    @Select("SELECT * FROM C_Bank WHERE Name = :name AND IsActive = 'Y'")
    Optional<Bank> findByName(String name);

    @Select("SELECT * FROM C_Bank WHERE RoutingNo = :routingNo AND IsActive = 'Y'")
    Optional<Bank> findByRoutingNo(String routingNo);

    @Select("SELECT * FROM C_Bank WHERE SwiftCode = :swiftCode AND IsActive = 'Y'")
    Optional<Bank> findBySwiftCode(String swiftCode);

    @Select("SELECT * FROM C_Bank WHERE IsOwnBank = 'Y' AND IsActive = 'Y'")
    List<Bank> findAllOwnBanks();

    @Select("SELECT * FROM C_Bank WHERE IsActive = 'Y' ORDER BY Name")
    List<Bank> findAllActive();
}
