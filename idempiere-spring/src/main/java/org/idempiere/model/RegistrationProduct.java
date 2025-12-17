package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Registration Product entity.
 * Maps to A_RegistrationProduct table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_RegistrationProduct")
public class RegistrationProduct extends BaseEntity {

    @Id
    @Column("A_RegistrationProduct_ID")
    private Integer aRegistrationProductId;

    @Column("A_Registration_ID")
    private Integer aRegistrationId;

    @Column("M_Product_ID")
    private Integer mProductId;
}
