package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Project Accounting entity - C_Project_Acct table.
 * Project accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Project_Acct")
public class ProjectAcct extends BaseEntity {

    @Id
    @Column("C_Project_ID")
    private Integer cProjectId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("PJ_Asset_Acct")
    private Integer pjAssetAcct;

    @Column("PJ_WIP_Acct")
    private Integer pjWipAcct;
}
