package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Package Export Common entity - AD_Package_Exp_Common table.
 * Package Export Common.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Package_Exp_Common")
public class ADPackageExpCommon extends BaseEntity {

    @Id
    @Column("AD_Package_Exp_Common_ID")
    private Integer adPackageExpCommonId;

    @Column("AD_Package_Exp_Detail_ID")
    private Integer adPackageExpDetailId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("AD_Table_ID")
    private Integer adTableId;
}
