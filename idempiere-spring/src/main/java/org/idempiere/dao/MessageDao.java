package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Message;

/**
 * DAO interface for Message entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface MessageDao extends CrudDao<Message, Integer, SQLBuilder.PSC, MessageDao> {

    /**
     * Find a message by value
     */
    @Query("SELECT * FROM AD_Message WHERE Value = :value AND IsActive = 'Y'")
    Optional<Message> findByValue(String value);

    /**
     * Find all active messages
     */
    @Query("SELECT * FROM AD_Message WHERE IsActive = 'Y' ORDER BY Value")
    List<Message> findAllActive();

    /**
     * Find messages by message type
     */
    @Query("SELECT * FROM AD_Message WHERE MsgType = :msgType AND IsActive = 'Y' ORDER BY Value")
    List<Message> findByMsgType(String msgType);

    /**
     * Find messages by entity type
     */
    @Query("SELECT * FROM AD_Message WHERE EntityType = :entityType AND IsActive = 'Y' ORDER BY Value")
    List<Message> findByEntityType(String entityType);

    /**
     * Find all messages including inactive
     */
    @Query("SELECT * FROM AD_Message ORDER BY Value")
    List<Message> findAll();
}
