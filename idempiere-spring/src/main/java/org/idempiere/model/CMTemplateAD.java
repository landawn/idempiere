package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * CM Template AD entity - CM_Template_AD table.
 * Content Management Template Advertisement.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Template_AD")
public class CMTemplateAD extends BaseEntity {

    @Id
    @Column("CM_Template_ID")
    private Integer cmTemplateId;

    @Id
    @Column("CM_AD_ID")
    private Integer cmAdId;

    @Column("IsValid")
    private String isValid;
}
