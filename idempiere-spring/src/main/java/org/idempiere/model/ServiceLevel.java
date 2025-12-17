package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Service Level entity - M_ServiceLevel table.
 * Product service level definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ServiceLevel")
public class ServiceLevel extends BaseEntity {

    @Id
    @Column("M_ServiceLevel_ID")
    private Integer mServiceLevelId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ServiceLevelProvided")
    private BigDecimal serviceLevelProvided;

    @Column("ServiceLevelInvoiced")
    private BigDecimal serviceLevelInvoiced;
}
