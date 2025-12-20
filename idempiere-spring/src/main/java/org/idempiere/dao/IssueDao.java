package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Issue;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Issue operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface IssueDao extends CrudDao<Issue, Integer, SQLBuilder.PSC, IssueDao> {

    @Query("SELECT * FROM AD_Issue WHERE Name = :name AND IsActive = 'Y'")
    Optional<Issue> findByName(String name);

    @Query("SELECT * FROM AD_Issue WHERE R_IssueProject_ID = :issueProjectId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findByIssueProject(int issueProjectId);

    @Query("SELECT * FROM AD_Issue WHERE R_IssueSystem_ID = :issueSystemId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findByIssueSystem(int issueSystemId);

    @Query("SELECT * FROM AD_Issue WHERE R_IssueUser_ID = :issueUserId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findByIssueUser(int issueUserId);

    @Query("SELECT * FROM AD_Issue WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findUnprocessed();

    @Query("SELECT * FROM AD_Issue WHERE SourceClassName = :className AND SourceMethodName = :methodName AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findBySourceLocation(String className, String methodName);

    @Query("SELECT * FROM AD_Issue WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findByClient(int clientId);

    @Query("SELECT * FROM AD_Issue WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findAllActive();
}
