package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Currency Algorithm entity - C_Currency_Alg table.
 * Currency conversion algorithm.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Currency_Alg")
public class CurrencyAlg extends BaseEntity {

    @Id
    @Column("C_Currency_Alg_ID")
    private Integer cCurrencyAlgId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Algorithm")
    private String algorithm;

    @Column("Classname")
    private String classname;
}
