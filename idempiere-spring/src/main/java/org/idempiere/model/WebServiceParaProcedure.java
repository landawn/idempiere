package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Service Para Procedure entity - WS_WebService_ParaProcedure table.
 * Web service procedure parameter configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("WS_WebService_ParaProcedure")
public class WebServiceParaProcedure extends BaseEntity {

    @Id
    @Column("WS_WebService_ParaProcedure_ID")
    private Integer wsWebServiceParaProcedureId;

    @Column("WS_WebServiceTypeAccess_ID")
    private Integer wsWebServiceTypeAccessId;

    @Column("ColumnName")
    private String columnName;

    @Column("ParameterName")
    private String parameterName;

    @Column("ConstantValue")
    private String constantValue;

    @Column("SeqNo")
    private Integer seqNo;
}
