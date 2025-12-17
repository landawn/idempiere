package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Info Window Access entity - AD_InfoWindow_Access table.
 * Role access to info windows.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_InfoWindow_Access")
public class InfoWindowAccess extends BaseEntity {

    @Id
    @Column("AD_InfoWindow_Access_ID")
    private Integer adInfoWindowAccessId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;
}
