package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Process Instance Log entity.
 * Maps to AD_PInstance_Log table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PInstance_Log")
public class PInstanceLog extends BaseEntity {

    @Id
    @Column("AD_PInstance_Log_ID")
    private Integer adPInstanceLogId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("Log_ID")
    private Integer logId;

    @Column("P_Date")
    private LocalDateTime pDate;

    @Column("P_ID")
    private Integer pId;

    @Column("P_Number")
    private BigDecimal pNumber;

    @Column("P_Msg")
    private String pMsg;
}
