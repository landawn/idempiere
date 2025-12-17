package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Issue;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Issue operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface IssueDao extends CrudDao<Issue, Integer, SQLBuilder.NSC, IssueDao> {

    @Select("SELECT * FROM AD_Issue WHERE Name = :name AND IsActive = 'Y'")
    Optional<Issue> findByName(String name);

    @Select("SELECT * FROM AD_Issue WHERE R_IssueProject_ID = :issueProjectId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findByIssueProject(int issueProjectId);

    @Select("SELECT * FROM AD_Issue WHERE R_IssueSystem_ID = :issueSystemId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findByIssueSystem(int issueSystemId);

    @Select("SELECT * FROM AD_Issue WHERE R_IssueUser_ID = :issueUserId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findByIssueUser(int issueUserId);

    @Select("SELECT * FROM AD_Issue WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findUnprocessed();

    @Select("SELECT * FROM AD_Issue WHERE SourceClassName = :className AND SourceMethodName = :methodName AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findBySourceLocation(String className, String methodName);

    @Select("SELECT * FROM AD_Issue WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findByClient(int clientId);

    @Select("SELECT * FROM AD_Issue WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<Issue> findAllActive();
}
