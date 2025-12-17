package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Form Access entity.
 * Maps to AD_Form_Access table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Form_Access")
public class FormAccess extends BaseEntity {

    @Id
    @Column("AD_Form_Access_UU")
    private String adFormAccessUU;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("IsReadWrite")
    private String isReadWrite;
}
