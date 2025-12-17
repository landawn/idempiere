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
 * Project Issue entity - C_ProjectIssue table.
 * Project issue/material issue.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ProjectIssue")
public class ProjectIssue extends BaseEntity {

    @Id
    @Column("C_ProjectIssue_ID")
    private Integer cProjectIssueId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("Line")
    private Integer line;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("MovementQty")
    private BigDecimal movementQty;

    @Column("Description")
    private String description;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("S_TimeExpenseLine_ID")
    private Integer sTimeExpenseLineId;

    @Column("Posted")
    private String posted;

    @Column("Processed")
    private String processed;
}
