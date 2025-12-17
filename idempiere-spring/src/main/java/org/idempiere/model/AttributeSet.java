package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Attribute Set entity.
 * Maps to M_AttributeSet table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_AttributeSet")
public class AttributeSet extends BaseEntity {

    @Id
    @Column("M_AttributeSet_ID")
    private Integer mAttributeSetId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsGuaranteeDate")
    private String isGuaranteeDate;

    @Column("GuaranteeDays")
    private Integer guaranteeDays;

    @Column("IsLot")
    private String isLot;

    @Column("M_LotCtl_ID")
    private Integer mLotCtlId;

    @Column("IsLotMandatory")
    private String isLotMandatory;

    @Column("IsSerNo")
    private String isSerNo;

    @Column("M_SerNoCtl_ID")
    private Integer mSerNoCtlId;

    @Column("IsSerNoMandatory")
    private String isSerNoMandatory;

    @Column("IsInstanceAttribute")
    private String isInstanceAttribute;

    @Column("MandatoryType")
    private String mandatoryType;

    @Column("IsGuaranteeDateMandatory")
    private String isGuaranteeDateMandatory;

    @Column("IsAutoGenerateLot")
    private String isAutoGenerateLot;

    @Column("UseGuaranteeDateForMPolicy")
    private String useGuaranteeDateForMPolicy;

    @Column("IsExcludeAutoDelivery")
    private String isExcludeAutoDelivery;
}
