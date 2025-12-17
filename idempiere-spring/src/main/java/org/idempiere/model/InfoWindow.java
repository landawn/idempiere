package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Info Window entity.
 * Maps to AD_InfoWindow table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_InfoWindow")
public class InfoWindow extends BaseEntity {

    @Id
    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("EntityType")
    private String entityType;

    @Column("FromClause")
    private String fromClause;

    @Column("WhereClause")
    private String whereClause;

    @Column("OtherClause")
    private String otherClause;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("AD_InfoWindow_ID_Source")
    private Integer adInfoWindowIdSource;

    @Column("IsValid")
    private String isValid;

    @Column("Processing")
    private String processing;

    @Column("IsDistinct")
    private String isDistinct;

    @Column("EnablePaging")
    private String enablePaging;

    @Column("PageSize")
    private Integer pageSize;

    @Column("LoadAllRecordsDefault")
    private String loadAllRecordsDefault;
}
