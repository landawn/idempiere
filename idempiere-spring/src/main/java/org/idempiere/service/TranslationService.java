package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.TranslationDao;
import org.idempiere.model.MessageTrl;
import org.idempiere.model.ElementTrl;
import org.idempiere.model.WindowTrl;
import org.idempiere.model.MenuTrl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Translation operations.
 */
@Service
@Transactional(readOnly = true)
public class TranslationService {

    private final TranslationDao translationDao;

    public TranslationService(TranslationDao translationDao) {
        this.translationDao = translationDao;
    }

    /**
     * Get message translation.
     */
    public Optional<String> getMessageTranslation(int messageId, String language) {
        Optional<MessageTrl> trl = translationDao.findMessageTrl(messageId, language);
        return trl.map(MessageTrl::getMsgText);
    }

    /**
     * Get all translated messages for a language.
     */
    public List<MessageTrl> getMessagesByLanguage(String language) {
        return translationDao.findMessagesByLanguage(language);
    }

    /**
     * Get element translation.
     */
    public Optional<ElementTrl> getElementTranslation(int elementId, String language) {
        return translationDao.findElementTrl(elementId, language);
    }

    /**
     * Get all translated elements for a language.
     */
    public List<ElementTrl> getElementsByLanguage(String language) {
        return translationDao.findElementsByLanguage(language);
    }

    /**
     * Get window translation.
     */
    public Optional<WindowTrl> getWindowTranslation(int windowId, String language) {
        return translationDao.findWindowTrl(windowId, language);
    }

    /**
     * Get menu translation.
     */
    public Optional<MenuTrl> getMenuTranslation(int menuId, String language) {
        return translationDao.findMenuTrl(menuId, language);
    }

    /**
     * Save message translation.
     */
    @Transactional
    public MessageTrl saveMessageTranslation(MessageTrl trl) {
        if (trl.getAdMessageTrlId() == null || trl.getAdMessageTrlId() == 0) {
            translationDao.insert(trl);
        } else {
            translationDao.update(trl);
        }
        return trl;
    }

    /**
     * Mark translation as translated.
     */
    @Transactional
    public void markAsTranslated(int messageTrlId) {
        Optional<MessageTrl> optTrl = translationDao.findById(messageTrlId);
        if (optTrl.isPresent()) {
            MessageTrl trl = optTrl.get();
            trl.setIsTranslated("Y");
            translationDao.update(trl);
        }
    }
}
