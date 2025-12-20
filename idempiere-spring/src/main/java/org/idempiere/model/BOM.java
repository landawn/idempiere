package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * BOM entity - represents Bill of Materials.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_BOM")
public class BOM extends BaseEntity {

    @Id
    @Column("M_BOM_ID")
    private Integer mBomId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("BOMType")
    private String bomType;

    @Column("BOMUse")
    private String bomUse;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("CopyFrom")
    private String copyFrom;

    @Column("Processing")
    private String processing;
}
