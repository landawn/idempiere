package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Request for Quotation Topic entity.
 * Maps to C_RfQ_Topic table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RfQ_Topic")
public class RfQTopic extends BaseEntity {

    @Id
    @Column("C_RfQ_Topic_ID")
    private Integer cRfQTopicId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_PrintFormat_ID")
    private Integer adPrintFormatId;

    @Column("IsSelfService")
    private String isSelfService;
}
