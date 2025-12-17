package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * A Registration Attribute entity - A_RegistrationAttribute table.
 * Registration Attribute.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_RegistrationAttribute")
public class ARegistrationAttribute extends BaseEntity {

    @Id
    @Column("A_RegistrationAttribute_ID")
    private Integer aRegistrationAttributeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Reference_Value_ID")
    private Integer adReferenceValueId;
}
