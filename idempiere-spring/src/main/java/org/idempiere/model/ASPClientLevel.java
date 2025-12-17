package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ASP Client Level entity - ASP_ClientLevel table.
 * ASP level assigned to a client.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("ASP_ClientLevel")
public class ASPClientLevel extends BaseEntity {

    @Id
    @Column("ASP_ClientLevel_ID")
    private Integer aspClientLevelId;

    @Column("ASP_Level_ID")
    private Integer aspLevelId;

    @Column("Help")
    private String help;
}
