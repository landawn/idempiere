package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Project Type Accounting entity - C_ProjectType_Acct table.
 * Project type accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ProjectType_Acct")
public class ProjectTypeAcct extends BaseEntity {

    @Id
    @Column("C_ProjectType_ID")
    private Integer cProjectTypeId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("PJ_Asset_Acct")
    private Integer pjAssetAcct;

    @Column("PJ_WIP_Acct")
    private Integer pjWipAcct;
}
