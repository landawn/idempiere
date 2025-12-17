package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Business Partner Relation entity - C_BP_Relation table.
 * Business partner relationship.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BP_Relation")
public class BPartnerRelation extends BaseEntity {

    @Id
    @Column("C_BP_Relation_ID")
    private Integer cBpRelationId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("C_BPartnerRelation_ID")
    private Integer cBPartnerRelationId;

    @Column("C_BPartnerRelation_Location_ID")
    private Integer cBPartnerRelationLocationId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsBillTo")
    private String isBillTo;

    @Column("IsPayFrom")
    private String isPayFrom;

    @Column("IsRemitTo")
    private String isRemitTo;

    @Column("IsShipTo")
    private String isShipTo;
}
