package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Group Product entity - M_ProductGroupProduct table.
 * Product group product association.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductGroupProduct")
public class ProductGroupProduct extends BaseEntity {

    @Id
    @Column("M_ProductGroupProduct_ID")
    private Integer mProductGroupProductId;

    @Column("M_Product_Group_ID")
    private Integer mProductGroupId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("SeqNo")
    private Integer seqNo;
}
