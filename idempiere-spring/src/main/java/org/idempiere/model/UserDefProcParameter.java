package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Defined Process Parameter entity - AD_UserDef_Proc_Parameter table.
 * User-defined process parameter customization.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserDef_Proc_Parameter")
public class UserDefProcParameter extends BaseEntity {

    @Id
    @Column("AD_UserDef_Proc_Parameter_ID")
    private Integer adUserDefProcParameterId;

    @Column("AD_UserDef_Proc_ID")
    private Integer adUserDefProcId;

    @Column("AD_Process_Para_ID")
    private Integer adProcessParaId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("IsDisplayed")
    private String isDisplayed;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("IsMandatory")
    private String isMandatory;
}
