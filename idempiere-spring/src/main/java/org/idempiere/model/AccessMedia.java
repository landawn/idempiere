package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Access Media entity - CM_AccessMedia table.
 * Web media access permission.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_AccessMedia")
public class AccessMedia extends BaseEntity {

    @Id
    @Column("CM_AccessMedia_ID")
    private Integer cmAccessMediaId;

    @Column("CM_AccessProfile_ID")
    private Integer cmAccessProfileId;

    @Column("CM_Media_ID")
    private Integer cmMediaId;
}
