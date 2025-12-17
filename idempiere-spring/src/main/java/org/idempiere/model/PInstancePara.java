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
 * Process Instance Parameter entity.
 * Maps to AD_PInstance_Para table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PInstance_Para")
public class PInstancePara extends BaseEntity {

    @Id
    @Column("AD_PInstance_Para_ID")
    private Integer adPInstanceParaId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("ParameterName")
    private String parameterName;

    @Column("P_String")
    private String pString;

    @Column("P_String_To")
    private String pStringTo;

    @Column("P_Number")
    private BigDecimal pNumber;

    @Column("P_Number_To")
    private BigDecimal pNumberTo;

    @Column("P_Date")
    private LocalDateTime pDate;

    @Column("P_Date_To")
    private LocalDateTime pDateTo;

    @Column("Info")
    private String info;

    @Column("Info_To")
    private String infoTo;
}
