package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * RMA Type entity - M_RMAType table.
 * Return Material Authorization type.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_RMAType")
public class RMAType extends BaseEntity {

    @Id
    @Column("M_RMAType_ID")
    private Integer mRMATypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
