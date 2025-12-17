package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tax Provider entity - C_TaxProvider table.
 * Tax calculation provider.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_TaxProvider")
public class TaxProvider extends BaseEntity {

    @Id
    @Column("C_TaxProvider_ID")
    private Integer cTaxProviderId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("TaxProviderClass")
    private String taxProviderClass;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("IsDefault")
    private String isDefault;
}
