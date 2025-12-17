package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Reference List entity - list values.
 * Maps to AD_Ref_List table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Ref_List")
public class RefList extends BaseEntity {

    @Id
    @Column("AD_Ref_List_ID")
    private Integer adRefListId;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("EntityType")
    private String entityType;

    @Column("ValidFrom")
    private java.time.LocalDateTime validFrom;

    @Column("ValidTo")
    private java.time.LocalDateTime validTo;
}
