package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Window Access entity.
 * Maps to AD_Window_Access table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Window_Access")
public class WindowAccess extends BaseEntity {

    @Id
    @Column("AD_Window_Access_UU")
    private String adWindowAccessUU;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("IsReadWrite")
    private String isReadWrite;
}
