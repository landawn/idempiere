package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Project Type Phase entity - C_Phase table.
 * Standard project phase template.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Phase")
public class ProjectTypePhase extends BaseEntity {

    @Id
    @Column("C_Phase_ID")
    private Integer cPhaseId;

    @Column("C_ProjectType_ID")
    private Integer cProjectTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("StandardQty")
    private BigDecimal standardQty;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Help")
    private String help;
}
