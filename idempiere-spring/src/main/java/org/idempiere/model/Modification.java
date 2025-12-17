package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Modification entity - AD_Modification table.
 * System customization tracking.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Modification")
public class Modification extends BaseEntity {

    @Id
    @Column("AD_Modification_ID")
    private Integer adModificationId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("EntityType")
    private String entityType;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("ModificationType")
    private String modificationType;

    @Column("Version")
    private String version;
}
