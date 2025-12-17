package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * BOM Feature entity - M_BOMFeature table.
 * Bill of Material Feature.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_BOMFeature")
public class BOMFeature extends BaseEntity {

    @Id
    @Column("M_BOMFeature_ID")
    private Integer mBomFeatureId;

    @Column("M_BOM_ID")
    private Integer mBomId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("FeatureType")
    private String featureType;

    @Column("M_BOMAlternative_ID")
    private Integer mBomAlternativeId;

    @Column("PrintName")
    private String printName;
}
