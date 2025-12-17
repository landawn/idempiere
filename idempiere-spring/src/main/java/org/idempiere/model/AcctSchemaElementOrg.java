package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Accounting Schema Element Org entity - C_AcctSchema_Element_Org table.
 * Organization specific accounting schema element configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AcctSchema_Element_Org")
public class AcctSchemaElementOrg extends BaseEntity {

    @Id
    @Column("C_AcctSchema_Element_ID")
    private Integer cAcctSchemaElementId;

    @Id
    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("Org_ID")
    private Integer orgId;

    @Column("IsBalanced")
    private String isBalanced;
}
