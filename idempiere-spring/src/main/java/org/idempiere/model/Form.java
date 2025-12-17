package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Special Form entity.
 * Maps to AD_Form table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Form")
public class Form extends BaseEntity {

    @Id
    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("AccessLevel")
    private String accessLevel;

    @Column("Classname")
    private String classname;

    @Column("EntityType")
    private String entityType;

    @Column("IsBetaFunctionality")
    private String isBetaFunctionality;

    @Column("JSPURL")
    private String jspUrl;
}
