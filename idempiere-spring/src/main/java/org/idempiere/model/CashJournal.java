package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Cash Journal entity - C_Cash table.
 * Cash journal header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Cash")
public class CashJournal extends BaseEntity {

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

    @Column("Processing")
    private String processing;

    @Column("Posted")
    private String posted;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Project_ID")
    private Integer cProjectId;
}
