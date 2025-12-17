package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Process Log entity - AD_PInstance_Log table.
 * Process instance log entry.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PInstance_Log")
public class ProcessLog extends BaseEntity {

    @Id
    @Column("AD_PInstance_Log_ID")
    private Integer adPInstanceLogId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("Log_ID")
    private Integer logId;

    @Column("P_Date")
    private java.time.LocalDateTime pDate;

    @Column("P_ID")
    private Integer pId;

    @Column("P_Number")
    private java.math.BigDecimal pNumber;

    @Column("P_Msg")
    private String pMsg;
}
