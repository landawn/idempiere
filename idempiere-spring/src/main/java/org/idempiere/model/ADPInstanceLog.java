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
 * AD PInstance Log entity - AD_PInstance_Log table.
 * Process Instance Log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PInstance_Log")
public class ADPInstanceLog extends BaseEntity {

    @Id
    @Column("AD_PInstance_Log_ID")
    private Integer adPInstanceLogId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("Log_ID")
    private Integer logId;

    @Column("P_ID")
    private BigDecimal pId;

    @Column("P_Number")
    private BigDecimal pNumber;

    @Column("P_Date")
    private LocalDateTime pDate;

    @Column("P_Msg")
    private String pMsg;
}
