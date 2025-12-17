package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * HR Concept entity - payroll concept definition.
 * Maps to HR_Concept table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Concept")
public class HRConcept extends BaseEntity {

    @Id
    @Column("HR_Concept_ID")
    private Integer hrConceptId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("HR_Concept_Category_ID")
    private Integer hrConceptCategoryId;

    @Column("ColumnType")
    private String columnType;

    @Column("Type")
    private String type;

    @Column("AccountSign")
    private String accountSign;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("IsManual")
    private String isManual;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("IsRegistered")
    private String isRegistered;

    @Column("IsPaid")
    private String isPaid;

    @Column("IsEmployee")
    private String isEmployee;

    @Column("C_TaxCategory_ID")
    private Integer cTaxCategoryId;

    @Column("IsReceipt")
    private String isReceipt;

    @Column("IsSaveInHistoric")
    private String isSaveInHistoric;
}
