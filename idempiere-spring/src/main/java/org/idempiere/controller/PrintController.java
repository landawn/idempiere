package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.PrintFormatItem;
import org.idempiere.model.PrintPaper;
import org.idempiere.model.PrintFont;
import org.idempiere.model.PrintColor;
import org.idempiere.model.PrintTableFormat;
import org.idempiere.model.ReportView;
import org.idempiere.model.ReportViewCol;
import org.idempiere.service.PrintService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Print operations.
 */
@RestController
@RequestMapping("/api/print")
public class PrintController {

    private final PrintService printService;

    public PrintController(PrintService printService) {
        this.printService = printService;
    }

    // PrintFormatItem endpoints
    @GetMapping("/format-items/format/{printFormatId}")
    public ResponseEntity<List<PrintFormatItem>> getItemsByPrintFormat(@PathVariable Integer printFormatId) {
        return ResponseEntity.ok(printService.findItemsByPrintFormat(printFormatId));
    }

    @GetMapping("/format-items/format/{printFormatId}/printed")
    public ResponseEntity<List<PrintFormatItem>> getPrintedItemsByPrintFormat(@PathVariable Integer printFormatId) {
        return ResponseEntity.ok(printService.findPrintedItemsByPrintFormat(printFormatId));
    }

    @PostMapping("/format-items")
    public ResponseEntity<PrintFormatItem> createItem(@RequestBody PrintFormatItem item) {
        return ResponseEntity.status(HttpStatus.CREATED).body(printService.saveItem(item));
    }

    @PutMapping("/format-items/{id}")
    public ResponseEntity<PrintFormatItem> updateItem(@PathVariable Integer id, @RequestBody PrintFormatItem item) {
        item.setAdPrintFormatItemId(id);
        return ResponseEntity.ok(printService.saveItem(item));
    }

    // PrintPaper endpoints
    @GetMapping("/papers/{id}")
    public ResponseEntity<PrintPaper> getPaperById(@PathVariable Integer id) {
        return printService.findPaperById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/papers/client/{clientId}")
    public ResponseEntity<List<PrintPaper>> getPapersByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(printService.findPapersByClient(clientId));
    }

    @GetMapping("/papers/default/client/{clientId}")
    public ResponseEntity<PrintPaper> getDefaultPaper(@PathVariable Integer clientId) {
        return printService.findDefaultPaper(clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/papers")
    public ResponseEntity<PrintPaper> createPaper(@RequestBody PrintPaper paper) {
        return ResponseEntity.status(HttpStatus.CREATED).body(printService.savePaper(paper));
    }

    @PutMapping("/papers/{id}")
    public ResponseEntity<PrintPaper> updatePaper(@PathVariable Integer id, @RequestBody PrintPaper paper) {
        if (!printService.findPaperById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        paper.setAdPrintPaperId(id);
        return ResponseEntity.ok(printService.savePaper(paper));
    }

    // PrintFont endpoints
    @GetMapping("/fonts")
    public ResponseEntity<List<PrintFont>> getAllFonts() {
        return ResponseEntity.ok(printService.findAllFonts());
    }

    @GetMapping("/fonts/{id}")
    public ResponseEntity<PrintFont> getFontById(@PathVariable Integer id) {
        return printService.findFontById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/fonts/default")
    public ResponseEntity<PrintFont> getDefaultFont() {
        return printService.findDefaultFont()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/fonts")
    public ResponseEntity<PrintFont> createFont(@RequestBody PrintFont font) {
        return ResponseEntity.status(HttpStatus.CREATED).body(printService.saveFont(font));
    }

    @PutMapping("/fonts/{id}")
    public ResponseEntity<PrintFont> updateFont(@PathVariable Integer id, @RequestBody PrintFont font) {
        if (!printService.findFontById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        font.setAdPrintFontId(id);
        return ResponseEntity.ok(printService.saveFont(font));
    }

    // PrintColor endpoints
    @GetMapping("/colors")
    public ResponseEntity<List<PrintColor>> getAllColors() {
        return ResponseEntity.ok(printService.findAllColors());
    }

    @GetMapping("/colors/{id}")
    public ResponseEntity<PrintColor> getColorById(@PathVariable Integer id) {
        return printService.findColorById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/colors/default")
    public ResponseEntity<PrintColor> getDefaultColor() {
        return printService.findDefaultColor()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/colors")
    public ResponseEntity<PrintColor> createColor(@RequestBody PrintColor color) {
        return ResponseEntity.status(HttpStatus.CREATED).body(printService.saveColor(color));
    }

    @PutMapping("/colors/{id}")
    public ResponseEntity<PrintColor> updateColor(@PathVariable Integer id, @RequestBody PrintColor color) {
        if (!printService.findColorById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        color.setAdPrintColorId(id);
        return ResponseEntity.ok(printService.saveColor(color));
    }

    // PrintTableFormat endpoints
    @GetMapping("/table-formats/{id}")
    public ResponseEntity<PrintTableFormat> getTableFormatById(@PathVariable Integer id) {
        return printService.findTableFormatById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/table-formats/client/{clientId}")
    public ResponseEntity<List<PrintTableFormat>> getTableFormatsByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(printService.findTableFormatsByClient(clientId));
    }

    @GetMapping("/table-formats/default/client/{clientId}")
    public ResponseEntity<PrintTableFormat> getDefaultTableFormat(@PathVariable Integer clientId) {
        return printService.findDefaultTableFormat(clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/table-formats")
    public ResponseEntity<PrintTableFormat> createTableFormat(@RequestBody PrintTableFormat tableFormat) {
        return ResponseEntity.status(HttpStatus.CREATED).body(printService.saveTableFormat(tableFormat));
    }

    @PutMapping("/table-formats/{id}")
    public ResponseEntity<PrintTableFormat> updateTableFormat(@PathVariable Integer id, @RequestBody PrintTableFormat tableFormat) {
        if (!printService.findTableFormatById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        tableFormat.setAdPrintTableFormatId(id);
        return ResponseEntity.ok(printService.saveTableFormat(tableFormat));
    }

    // ReportView endpoints
    @GetMapping("/report-views/{id}")
    public ResponseEntity<ReportView> getReportViewById(@PathVariable Integer id) {
        return printService.findReportViewById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/report-views/client/{clientId}")
    public ResponseEntity<List<ReportView>> getReportViewsByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(printService.findReportViewsByClient(clientId));
    }

    @GetMapping("/report-views/table/{tableId}")
    public ResponseEntity<List<ReportView>> getReportViewsByTable(@PathVariable Integer tableId) {
        return ResponseEntity.ok(printService.findReportViewsByTable(tableId));
    }

    @PostMapping("/report-views")
    public ResponseEntity<ReportView> createReportView(@RequestBody ReportView reportView) {
        return ResponseEntity.status(HttpStatus.CREATED).body(printService.saveReportView(reportView));
    }

    @PutMapping("/report-views/{id}")
    public ResponseEntity<ReportView> updateReportView(@PathVariable Integer id, @RequestBody ReportView reportView) {
        if (!printService.findReportViewById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        reportView.setAdReportViewId(id);
        return ResponseEntity.ok(printService.saveReportView(reportView));
    }

    // ReportViewCol endpoints
    @GetMapping("/report-views/{reportViewId}/columns")
    public ResponseEntity<List<ReportViewCol>> getColumnsByReportView(@PathVariable Integer reportViewId) {
        return ResponseEntity.ok(printService.findColumnsByReportView(reportViewId));
    }

    @PostMapping("/report-views/{reportViewId}/columns")
    public ResponseEntity<ReportViewCol> createReportViewCol(@PathVariable Integer reportViewId, @RequestBody ReportViewCol col) {
        col.setAdReportViewId(reportViewId);
        return ResponseEntity.status(HttpStatus.CREATED).body(printService.saveReportViewCol(col));
    }

    @PutMapping("/report-views/columns/{id}")
    public ResponseEntity<ReportViewCol> updateReportViewCol(@PathVariable Integer id, @RequestBody ReportViewCol col) {
        col.setAdReportViewColId(id);
        return ResponseEntity.ok(printService.saveReportViewCol(col));
    }
}
