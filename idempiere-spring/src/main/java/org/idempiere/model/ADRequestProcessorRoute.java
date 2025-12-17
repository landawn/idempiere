package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Request Processor Route entity - R_RequestProcessor_Route table.
 * Request Processor Route.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_RequestProcessor_Route")
public class ADRequestProcessorRoute extends BaseEntity {

    @Id
    @Column("R_RequestProcessor_Route_ID")
    private Integer rRequestProcessorRouteId;

    @Column("R_RequestProcessor_ID")
    private Integer rRequestProcessorId;

    @Column("R_RequestType_ID")
    private Integer rRequestTypeId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("Keyword")
    private String keyword;
}
