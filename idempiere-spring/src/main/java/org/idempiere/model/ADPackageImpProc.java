package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Package Import Process entity - AD_Package_Imp_Proc table.
 * Package Import Process.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Package_Imp_Proc")
public class ADPackageImpProc extends BaseEntity {

    @Id
    @Column("AD_Package_Imp_Proc_ID")
    private Integer adPackageImpProcId;

    @Column("OverrideDict")
    private String overrideDict;

    @Column("AD_Package_Dir")
    private String adPackageDir;

    @Column("AD_Package_Source")
    private String adPackageSource;

    @Column("AD_Package_Source_Type")
    private String adPackageSourceType;

    @Column("Processing")
    private String processing;

    @Column("P_Msg")
    private String pMsg;
}
