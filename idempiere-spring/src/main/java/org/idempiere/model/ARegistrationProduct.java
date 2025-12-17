package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * A Registration Product entity - A_RegistrationProduct table.
 * Registration Product.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_RegistrationProduct")
public class ARegistrationProduct extends BaseEntity {

    @Id
    @Column("A_RegistrationAttribute_ID")
    private Integer aRegistrationAttributeId;

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Description")
    private String description;
}
