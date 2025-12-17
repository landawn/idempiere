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
 * Project Type Phase entity - C_ProjectType_Phase table.
 * Standard phase template for project type.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Phase")
public class CProjectTypePhase extends BaseEntity {

    @Id
    @Column("C_Phase_ID")
    private Integer cPhaseId;

    @Column("C_ProjectType_ID")
    private Integer cProjectTypeId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Name")
    private String name;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("StandardQty")
    private BigDecimal standardQty;
}
