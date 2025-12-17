package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * MFA Method entity - AD_MFAMethod table.
 * Multi-factor authentication method definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_MFAMethod")
public class MFAMethod extends BaseEntity {

    @Id
    @Column("AD_MFAMethod_ID")
    private Integer adMFAMethodId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Classname")
    private String classname;

    @Column("IsDefault")
    private String isDefault;

    @Column("SeqNo")
    private Integer seqNo;
}
