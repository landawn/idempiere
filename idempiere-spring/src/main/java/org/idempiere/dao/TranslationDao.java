package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.MessageTrl;
import org.idempiere.model.ElementTrl;
import org.idempiere.model.WindowTrl;
import org.idempiere.model.MenuTrl;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Translation entity operations.
 */
@Cache(capacity = 2000, evictDelay = 3000)
public interface TranslationDao extends CrudDao<MessageTrl, Integer, SQLBuilder.PSC, TranslationDao> {

    @Query("SELECT * FROM AD_Message_Trl WHERE AD_Message_ID = :messageId AND AD_Language = :language")
    Optional<MessageTrl> findMessageTrl(int messageId, String language);

    @Query("SELECT * FROM AD_Message_Trl WHERE AD_Language = :language AND IsTranslated = 'Y'")
    List<MessageTrl> findMessagesByLanguage(String language);

    @Query("SELECT * FROM AD_Element_Trl WHERE AD_Element_ID = :elementId AND AD_Language = :language")
    Optional<ElementTrl> findElementTrl(int elementId, String language);

    @Query("SELECT * FROM AD_Element_Trl WHERE AD_Language = :language AND IsTranslated = 'Y'")
    List<ElementTrl> findElementsByLanguage(String language);

    @Query("SELECT * FROM AD_Window_Trl WHERE AD_Window_ID = :windowId AND AD_Language = :language")
    Optional<WindowTrl> findWindowTrl(int windowId, String language);

    @Query("SELECT * FROM AD_Menu_Trl WHERE AD_Menu_ID = :menuId AND AD_Language = :language")
    Optional<MenuTrl> findMenuTrl(int menuId, String language);
}
