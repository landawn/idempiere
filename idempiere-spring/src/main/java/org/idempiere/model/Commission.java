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
 * Commission entity.
 * Maps to C_Commission table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Commission")
public class Commission extends BaseEntity {

    @Id
    @Column("C_Commission_ID")
    private Integer cCommissionId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("DocBasisType")
    private String docBasisType;

    @Column("FrequencyType")
    private String frequencyType;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

    @Column("ListDetails")
    private String listDetails;

    @Column("CreateFrom")
    private String createFrom;

    @Column("Processing")
    private String processing;
}
