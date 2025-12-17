package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Access Container entity - CM_AccessContainer table.
 * Web container access permission.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_AccessContainer")
public class AccessContainer extends BaseEntity {

    @Id
    @Column("CM_AccessContainer_ID")
    private Integer cmAccessContainerId;

    @Column("CM_AccessProfile_ID")
    private Integer cmAccessProfileId;

    @Column("CM_Container_ID")
    private Integer cmContainerId;
}
