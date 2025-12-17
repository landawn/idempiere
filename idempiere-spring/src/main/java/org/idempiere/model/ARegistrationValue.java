package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * A Registration Value entity - A_RegistrationValue table.
 * Registration Value.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_RegistrationValue")
public class ARegistrationValue extends BaseEntity {

    @Id
    @Column("A_Registration_ID")
    private Integer aRegistrationId;

    @Id
    @Column("A_RegistrationAttribute_ID")
    private Integer aRegistrationAttributeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
