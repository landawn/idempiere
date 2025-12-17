package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Document Type Access entity - C_DocType_Access table.
 * Role access to document types.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DocType_Access")
public class DocTypeAccess extends BaseEntity {

    @Id
    @Column("C_DocType_Access_ID")
    private Integer cDocTypeAccessId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;
}
