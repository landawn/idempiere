package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * CM Access News Channel entity - CM_AccessNewsChannel table.
 * Content Management Access News Channel.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_AccessNewsChannel")
public class CMAccessNewsChannel extends BaseEntity {

    @Id
    @Column("CM_AccessProfile_ID")
    private Integer cmAccessProfileId;

    @Id
    @Column("CM_NewsChannel_ID")
    private Integer cmNewsChannelId;
}
