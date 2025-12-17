package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * PA Ratio entity - PA_Ratio table.
 * Performance Analysis Ratio.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_Ratio")
public class PARatio extends BaseEntity {

    @Id
    @Column("PA_Ratio_ID")
    private Integer paRatioId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;
}
