package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * BP Credit entity - C_BPartner_Credit table.
 * Business partner credit information.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BPartner_Credit")
public class BPCredit extends BaseEntity {

    @Id
    @Column("C_BPartner_Credit_ID")
    private Integer cBPartnerCreditId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("SO_CreditUsed")
    private BigDecimal soCreditUsed;

    @Column("TotalOpenBalance")
    private BigDecimal totalOpenBalance;

    @Column("DateFirstSale")
    private LocalDateTime dateFirstSale;

    @Column("ActualLifeTimeValue")
    private BigDecimal actualLifeTimeValue;
}
