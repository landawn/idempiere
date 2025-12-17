package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Document Action Access entity - AD_Document_Action_Access table.
 * Document action access per role.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Document_Action_Access")
public class DocActionAccess extends BaseEntity {

    @Id
    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Id
    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Id
    @Column("AD_Ref_List_ID")
    private Integer adRefListId;
}
