package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ASP Process Para entity - ASP_Process_Para table.
 * ASP process parameter configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("ASP_Process_Para")
public class ASPProcessPara extends BaseEntity {

    @Id
    @Column("ASP_Process_Para_ID")
    private Integer aspProcessParaId;

    @Column("AD_Process_Para_ID")
    private Integer adProcessParaId;

    @Column("ASP_Process_ID")
    private Integer aspProcessId;

    @Column("ASP_Status")
    private String aspStatus;
}
