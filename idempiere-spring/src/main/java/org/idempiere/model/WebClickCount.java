package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Click Count entity.
 * Maps to W_ClickCount table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_ClickCount")
public class WebClickCount extends BaseEntity {

    @Id
    @Column("W_ClickCount_ID")
    private Integer wClickCountId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("TargetURL")
    private String targetUrl;

    @Column("W_Counter_ID")
    private Integer wCounterId;

    @Column("CM_Media_ID")
    private Integer cmMediaId;

    @Column("CM_CStage_ID")
    private Integer cmCStageId;
}
