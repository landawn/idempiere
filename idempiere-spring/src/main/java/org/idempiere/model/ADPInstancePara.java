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
 * AD PInstance Para entity - AD_PInstance_Para table.
 * Process Instance Parameter.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PInstance_Para")
public class ADPInstancePara extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Id
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

    @Column("AD_InfoColumn_ID")
    private Integer adInfoColumnId;
}
