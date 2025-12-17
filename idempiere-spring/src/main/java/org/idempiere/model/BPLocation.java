package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Business Partner Location entity - C_BPartner_Location table.
 * Business partner address.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BPartner_Location")
public class BPLocation extends BaseEntity {

    @Id
    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Location_ID")
    private Integer cLocationId;

    @Column("Name")
    private String name;

    @Column("Phone")
    private String phone;

    @Column("Phone2")
    private String phone2;

    @Column("Fax")
    private String fax;

    @Column("ISDN")
    private String isdn;

    @Column("IsBillTo")
    private String isBillTo;

    @Column("IsShipTo")
    private String isShipTo;

    @Column("IsPayFrom")
    private String isPayFrom;

    @Column("IsRemitTo")
    private String isRemitTo;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;
}
