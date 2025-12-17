package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Cash Journal entity.
 * Maps to C_Cash table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Cash")
public class Cash extends BaseEntity {

    @Id
    @Column("C_Cash_ID")
    private Integer cCashId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_CashBook_ID")
    private Integer cCashBookId;

    @Column("StatementDate")
    private LocalDateTime statementDate;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("BeginningBalance")
    private BigDecimal beginningBalance;

    @Column("EndingBalance")
    private BigDecimal endingBalance;

    @Column("StatementDifference")
    private BigDecimal statementDifference;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processed")
    private String processed;

    @Column("Posted")
    private String posted;

    @Column("IsApproved")
    private String isApproved;

    @Column("AD_User_ID")
    private Integer adUserId;
}
