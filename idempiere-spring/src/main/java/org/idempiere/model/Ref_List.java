package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Reference List entity - AD_Ref_List table.
 * Reference list values.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Ref_List")
public class Ref_List extends BaseEntity {

    @Id
    @Column("AD_Ref_List_ID")
    private Integer adRefListId;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Value")
    private String value;

    @Column("ValidFrom")
    private java.time.LocalDateTime validFrom;

    @Column("ValidTo")
    private java.time.LocalDateTime validTo;

    @Column("EntityType")
    private String entityType;
}
