package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Reference entity - data types and validation.
 * Maps to AD_Reference table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Reference")
public class Reference extends BaseEntity {

    @Id
    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("ValidationType")
    private String validationType;

    @Column("VFormat")
    private String vFormat;

    @Column("EntityType")
    private String entityType;

    @Column("IsOrderByValue")
    private String isOrderByValue;
}
