package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.MessageDao;
import org.idempiere.model.Message;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

/**
 * Service class for Message business operations.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class MessageService {

    private final MessageDao messageDao;

    /**
     * Find message by ID.
     */
    public Optional<Message> findById(int messageId) {
        try { return Optional.ofNullable(messageDao.gett(messageId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Find message by value.
     */
    public Optional<Message> findByValue(String value) {
        return messageDao.findByValue(value);
    }

    /**
     * Find messages by message type.
     */
    public List<Message> findByMsgType(String msgType) {
        return messageDao.findByMsgType(msgType);
    }

    /**
     * Find messages by entity type.
     */
    public List<Message> findByEntityType(String entityType) {
        return messageDao.findByEntityType(entityType);
    }

    /**
     * Find all active messages.
     */
    public List<Message> findAllActive() {
        return messageDao.findAllActive();
    }

    /**
     * Find all messages.
     */
    public List<Message> findAll() {
        return messageDao.findAll();
    }

    /**
     * Save a message.
     */
    public Message save(Message message) {
        try {
            if (message.getAdMessageId() == null || message.getAdMessageId() == 0) {
                messageDao.insert(message);
            } else {
                messageDao.update(message);
            }
            return message;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    /**
     * Delete a message.
     */
    public void delete(int messageId) {
        try { messageDao.deleteById(messageId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Check if message exists.
     */
    public boolean exists(int messageId) {
        try { return messageDao.exists(messageId); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
