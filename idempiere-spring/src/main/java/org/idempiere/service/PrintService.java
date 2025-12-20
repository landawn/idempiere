package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.PrintFormatItemDao;
import org.idempiere.dao.PrintPaperDao;
import org.idempiere.dao.PrintFontDao;
import org.idempiere.dao.PrintColorDao;
import org.idempiere.dao.PrintTableFormatDao;
import org.idempiere.dao.ReportViewDao;
import org.idempiere.dao.ReportViewColDao;
import org.idempiere.model.PrintFormatItem;
import org.idempiere.model.PrintPaper;
import org.idempiere.model.PrintFont;
import org.idempiere.model.PrintColor;
import org.idempiere.model.PrintTableFormat;
import org.idempiere.model.ReportView;
import org.idempiere.model.ReportViewCol;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Print entity operations.
 */
@Service
@Transactional
public class PrintService {

    private final PrintFormatItemDao printFormatItemDao;
    private final PrintPaperDao printPaperDao;
    private final PrintFontDao printFontDao;
    private final PrintColorDao printColorDao;
    private final PrintTableFormatDao printTableFormatDao;
    private final ReportViewDao reportViewDao;
    private final ReportViewColDao reportViewColDao;

    public PrintService(PrintFormatItemDao printFormatItemDao, PrintPaperDao printPaperDao,
                        PrintFontDao printFontDao, PrintColorDao printColorDao,
                        PrintTableFormatDao printTableFormatDao, ReportViewDao reportViewDao,
                        ReportViewColDao reportViewColDao) {
        this.printFormatItemDao = printFormatItemDao;
        this.printPaperDao = printPaperDao;
        this.printFontDao = printFontDao;
        this.printColorDao = printColorDao;
        this.printTableFormatDao = printTableFormatDao;
        this.reportViewDao = reportViewDao;
        this.reportViewColDao = reportViewColDao;
    }

    // PrintFormatItem methods
    public List<PrintFormatItem> findItemsByPrintFormat(Integer printFormatId) {
        return printFormatItemDao.findByPrintFormat(printFormatId);
    }

    public List<PrintFormatItem> findPrintedItemsByPrintFormat(Integer printFormatId) {
        return printFormatItemDao.findPrintedByPrintFormat(printFormatId);
    }

    public PrintFormatItem saveItem(PrintFormatItem item) {
        try {
            if (item.getAdPrintFormatItemId() == null) {
                printFormatItemDao.insert(item);
            } else {
                printFormatItemDao.update(item);
            }
            return item;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // PrintPaper methods
    public Optional<PrintPaper> findPaperById(Integer id) {
        try { return Optional.ofNullable(printPaperDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<PrintPaper> findPapersByClient(Integer clientId) {
        return printPaperDao.findByClient(clientId);
    }

    public Optional<PrintPaper> findDefaultPaper(Integer clientId) {
        return printPaperDao.findDefault(clientId);
    }

    public PrintPaper savePaper(PrintPaper paper) {
        try {
            if (paper.getAdPrintPaperId() == null) {
                printPaperDao.insert(paper);
            } else {
                printPaperDao.update(paper);
            }
            return paper;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // PrintFont methods
    public Optional<PrintFont> findFontById(Integer id) {
        try { return Optional.ofNullable(printFontDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<PrintFont> findAllFonts() {
        return printFontDao.findAll();
    }

    public Optional<PrintFont> findDefaultFont() {
        return printFontDao.findDefault();
    }

    public PrintFont saveFont(PrintFont font) {
        try {
            if (font.getAdPrintFontId() == null) {
                printFontDao.insert(font);
            } else {
                printFontDao.update(font);
            }
            return font;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // PrintColor methods
    public Optional<PrintColor> findColorById(Integer id) {
        try { return Optional.ofNullable(printColorDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<PrintColor> findAllColors() {
        return printColorDao.findAll();
    }

    public Optional<PrintColor> findDefaultColor() {
        return printColorDao.findDefault();
    }

    public PrintColor saveColor(PrintColor color) {
        try {
            if (color.getAdPrintColorId() == null) {
                printColorDao.insert(color);
            } else {
                printColorDao.update(color);
            }
            return color;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // PrintTableFormat methods
    public Optional<PrintTableFormat> findTableFormatById(Integer id) {
        try { return Optional.ofNullable(printTableFormatDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<PrintTableFormat> findTableFormatsByClient(Integer clientId) {
        return printTableFormatDao.findByClient(clientId);
    }

    public Optional<PrintTableFormat> findDefaultTableFormat(Integer clientId) {
        return printTableFormatDao.findDefault(clientId);
    }

    public PrintTableFormat saveTableFormat(PrintTableFormat tableFormat) {
        try {
            if (tableFormat.getAdPrintTableFormatId() == null) {
                printTableFormatDao.insert(tableFormat);
            } else {
                printTableFormatDao.update(tableFormat);
            }
            return tableFormat;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // ReportView methods
    public Optional<ReportView> findReportViewById(Integer id) {
        try { return Optional.ofNullable(reportViewDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<ReportView> findReportViewsByClient(Integer clientId) {
        return reportViewDao.findByClient(clientId);
    }

    public List<ReportView> findReportViewsByTable(Integer tableId) {
        return reportViewDao.findByTable(tableId);
    }

    public ReportView saveReportView(ReportView reportView) {
        try {
            if (reportView.getAdReportViewId() == null) {
                reportViewDao.insert(reportView);
            } else {
                reportViewDao.update(reportView);
            }
            return reportView;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // ReportViewCol methods
    public List<ReportViewCol> findColumnsByReportView(Integer reportViewId) {
        return reportViewColDao.findByReportView(reportViewId);
    }

    public ReportViewCol saveReportViewCol(ReportViewCol col) {
        try {
            if (col.getAdReportViewColId() == null) {
                reportViewColDao.insert(col);
            } else {
                reportViewColDao.update(col);
            }
            return col;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }
}
