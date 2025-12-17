package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Business Partner Location entity.
 * Maps to C_BPartner_Location table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BPartner_Location")
public class BPartnerLocation extends BaseEntity {

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

    @Column("IsShipTo")
    private String isShipTo;

    @Column("IsBillTo")
    private String isBillTo;

    @Column("IsPayFrom")
    private String isPayFrom;

    @Column("IsRemitTo")
    private String isRemitTo;

    @Column("ContactPerson")
    private String contactPerson;

    @Column("IsPreserveCustomName")
    private String isPreserveCustomName;
}
