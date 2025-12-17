package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Project Issue MA entity - C_ProjectIssueMA table.
 * Project issue material allocation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ProjectIssueMA")
public class ProjectIssueMA extends BaseEntity {

    @Id
    @Column("C_ProjectIssueMA_ID")
    private Integer cProjectIssueMaId;

    @Column("C_ProjectIssue_ID")
    private Integer cProjectIssueId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("MovementQty")
    private BigDecimal movementQty;

    @Column("DateMaterialPolicy")
    private LocalDate dateMaterialPolicy;
}
