package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * K Index Log entity - K_IndexLog table.
 * Knowledge Index Log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("K_IndexLog")
public class KIndexLog extends BaseEntity {

    @Id
    @Column("K_IndexLog_ID")
    private Integer kIndexLogId;

    @Column("IndexQueryResult")
    private Integer indexQueryResult;

    @Column("QuerySource")
    private String querySource;
}
