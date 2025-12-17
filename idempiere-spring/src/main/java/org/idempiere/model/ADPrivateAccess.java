package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Private Access entity - AD_Private_Access table.
 * Private access to records.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Private_Access")
public class ADPrivateAccess extends BaseEntity {

    @Id
    @Column("AD_User_ID")
    private Integer adUserId;

    @Id
    @Column("AD_Table_ID")
    private Integer adTableId;

    @Id
    @Column("Record_ID")
    private Integer recordId;
}
