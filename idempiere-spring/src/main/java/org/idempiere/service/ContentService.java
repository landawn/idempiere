package org.idempiere.service;

import org.idempiere.dao.ContentDao;
import org.idempiere.model.WebContainer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service for Web Content management operations.
 */
@Service
@Transactional(readOnly = true)
public class ContentService {

    private final ContentDao contentDao;

    public ContentService(ContentDao contentDao) {
        this.contentDao = contentDao;
    }

    public Optional<WebContainer> findById(int containerId) {
        return contentDao.findById(containerId);
    }

    public Optional<WebContainer> findByName(String name, int webProjectId) {
        return contentDao.findByName(name, webProjectId);
    }

    public List<WebContainer> findByWebProject(int webProjectId) {
        return contentDao.findByWebProject(webProjectId);
    }

    public Optional<WebContainer> findByRelativeUrl(String relativeUrl, int webProjectId) {
        return contentDao.findByRelativeUrl(relativeUrl, webProjectId);
    }

    public List<WebContainer> findValid() {
        return contentDao.findValid();
    }

    public List<WebContainer> findSummaryByProject(int webProjectId) {
        return contentDao.findSummaryByProject(webProjectId);
    }

    @Transactional
    public WebContainer create(WebContainer container) {
        if (container.getIsValid() == null) {
            container.setIsValid("N");
        }
        if (container.getIsIndexed() == null) {
            container.setIsIndexed("Y");
        }
        if (container.getIsSummary() == null) {
            container.setIsSummary("N");
        }
        if (container.getIsSecure() == null) {
            container.setIsSecure("N");
        }
        contentDao.insert(container);
        return container;
    }

    @Transactional
    public WebContainer update(WebContainer container) {
        contentDao.update(container);
        return container;
    }

    @Transactional
    public void validate(int containerId) {
        Optional<WebContainer> containerOpt = contentDao.findById(containerId);
        if (containerOpt.isPresent()) {
            WebContainer container = containerOpt.get();
            container.setIsValid("Y");
            contentDao.update(container);
        }
    }

    @Transactional
    public void invalidate(int containerId) {
        Optional<WebContainer> containerOpt = contentDao.findById(containerId);
        if (containerOpt.isPresent()) {
            WebContainer container = containerOpt.get();
            container.setIsValid("N");
            contentDao.update(container);
        }
    }

    @Transactional
    public void delete(int containerId) {
        Optional<WebContainer> containerOpt = contentDao.findById(containerId);
        containerOpt.ifPresent(contentDao::delete);
    }
}
