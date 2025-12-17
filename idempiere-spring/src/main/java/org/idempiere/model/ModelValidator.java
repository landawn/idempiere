package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Model Validator entity.
 * Maps to AD_ModelValidator table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ModelValidator")
public class ModelValidator extends BaseEntity {

    @Id
    @Column("AD_ModelValidator_ID")
    private Integer adModelValidatorId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("EntityType")
    private String entityType;

    @Column("ModelValidationClass")
    private String modelValidationClass;

    @Column("SeqNo")
    private Integer seqNo;
}
