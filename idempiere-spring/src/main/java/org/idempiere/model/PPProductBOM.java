package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product BOM entity - Bill of Materials header.
 * Maps to PP_Product_BOM table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PP_Product_BOM")
public class PPProductBOM extends BaseEntity {

    @Id
    @Column("PP_Product_BOM_ID")
    private Integer ppProductBomId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("BOMType")
    private String bomType;

    @Column("BOMUse")
    private String bomUse;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("Revision")
    private String revision;

    @Column("DocumentNo")
    private String documentNo;

    @Column("CopyFrom")
    private String copyFrom;

    @Column("Processing")
    private String processing;

    @Column("M_ChangeNotice_ID")
    private Integer mChangeNoticeId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;
}
