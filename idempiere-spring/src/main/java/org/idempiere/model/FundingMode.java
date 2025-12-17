package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Funding Mode entity - A_FundingMode table.
 * Asset funding mode.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_FundingMode")
public class FundingMode extends BaseEntity {

    @Id
    @Column("A_FundingMode_ID")
    private Integer aFundingModeId;

    @Column("Name")
    private String name;

    @Column("Value")
    private String value;

    @Column("Description")
    private String description;
}
