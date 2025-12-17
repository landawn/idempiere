package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Browse Access entity - AD_Browse_Access table.
 * Role access to browse windows.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Browse_Access")
public class BrowseAccess extends BaseEntity {

    @Id
    @Column("AD_Browse_Access_ID")
    private Integer adBrowseAccessId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Browse_ID")
    private Integer adBrowseId;

    @Column("IsReadWrite")
    private String isReadWrite;
}
