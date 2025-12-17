package org.idempiere.dao;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.dao.CrudDao;

import org.idempiere.model.WebContainer;

import java.util.List;
import java.util.Optional;

/**
 * DAO for Web Container (CM_Container) table operations.
 */
@Dao(cache = @Cache(capacity = 500, evictDelay = 3000))
public interface ContentDao extends CrudDao<WebContainer, Integer, SQLBuilder.NSC, ContentDao> {

    @Select("SELECT * FROM CM_Container WHERE Name = :name AND CM_WebProject_ID = :webProjectId")
    Optional<WebContainer> findByName(String name, int webProjectId);

    @Select("SELECT * FROM CM_Container WHERE CM_WebProject_ID = :webProjectId AND IsActive = 'Y' ORDER BY Priority, Name")
    List<WebContainer> findByWebProject(int webProjectId);

    @Select("SELECT * FROM CM_Container WHERE RelativeURL = :relativeUrl AND CM_WebProject_ID = :webProjectId")
    Optional<WebContainer> findByRelativeUrl(String relativeUrl, int webProjectId);

    @Select("SELECT * FROM CM_Container WHERE IsValid = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<WebContainer> findValid();

    @Select("SELECT * FROM CM_Container WHERE IsSummary = 'Y' AND CM_WebProject_ID = :webProjectId AND IsActive = 'Y' ORDER BY Name")
    List<WebContainer> findSummaryByProject(int webProjectId);
}
