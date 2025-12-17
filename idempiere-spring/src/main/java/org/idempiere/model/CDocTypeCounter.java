package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Document Type Counter entity - C_DocTypeCounter table.
 * Counter document type mapping.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DocTypeCounter")
public class CDocTypeCounter extends BaseEntity {

    @Id
    @Column("C_DocTypeCounter_ID")
    private Integer cDocTypeCounterId;

    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("Counter_C_DocType_ID")
    private Integer counterCDocTypeId;

    @Column("Description")
    private String description;

    @Column("DocAction")
    private String docAction;

    @Column("IsCreateCounter")
    private String isCreateCounter;

    @Column("IsValid")
    private String isValid;

    @Column("Name")
    private String name;
}
