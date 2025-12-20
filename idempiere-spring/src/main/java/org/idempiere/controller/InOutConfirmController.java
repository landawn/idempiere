package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.InOutConfirm;
import org.idempiere.model.InOutLineConfirm;
import org.idempiere.service.InOutConfirmService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for InOut Confirmation operations.
 */
@RestController
@RequestMapping("/api/inout-confirms")
public class InOutConfirmController {

    private final InOutConfirmService inOutConfirmService;

    public InOutConfirmController(InOutConfirmService inOutConfirmService) {
        this.inOutConfirmService = inOutConfirmService;
    }

    @GetMapping
    public ResponseEntity<List<InOutConfirm>> getAllConfirms() {
        return ResponseEntity.ok(inOutConfirmService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<InOutConfirm> getConfirmById(@PathVariable Integer id) {
        return inOutConfirmService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/inout/{inOutId}")
    public ResponseEntity<List<InOutConfirm>> getConfirmsByInOut(@PathVariable Integer inOutId) {
        return ResponseEntity.ok(inOutConfirmService.findByInOut(inOutId));
    }

    @GetMapping("/status/{docStatus}/client/{clientId}")
    public ResponseEntity<List<InOutConfirm>> getConfirmsByDocStatus(@PathVariable String docStatus, @PathVariable Integer clientId) {
        return ResponseEntity.ok(inOutConfirmService.findByDocStatus(docStatus, clientId));
    }

    @GetMapping("/document")
    public ResponseEntity<InOutConfirm> getConfirmByDocumentNo(@RequestParam String documentNo, @RequestParam Integer clientId) {
        return inOutConfirmService.findByDocumentNo(documentNo, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<InOutConfirm> createConfirm(@RequestBody InOutConfirm confirm) {
        return ResponseEntity.status(HttpStatus.CREATED).body(inOutConfirmService.save(confirm));
    }

    @PutMapping("/{id}")
    public ResponseEntity<InOutConfirm> updateConfirm(@PathVariable Integer id, @RequestBody InOutConfirm confirm) {
        if (!inOutConfirmService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        confirm.setMInOutConfirmId(id);
        return ResponseEntity.ok(inOutConfirmService.save(confirm));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteConfirm(@PathVariable Integer id) {
        if (!inOutConfirmService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        inOutConfirmService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // InOutLineConfirm endpoints
    @GetMapping("/{confirmId}/lines")
    public ResponseEntity<List<InOutLineConfirm>> getConfirmLines(@PathVariable Integer confirmId) {
        return ResponseEntity.ok(inOutConfirmService.findLinesByConfirm(confirmId));
    }

    @GetMapping("/lines/inout-line/{inOutLineId}")
    public ResponseEntity<List<InOutLineConfirm>> getConfirmLinesByInOutLine(@PathVariable Integer inOutLineId) {
        return ResponseEntity.ok(inOutConfirmService.findLinesByInOutLine(inOutLineId));
    }

    @PostMapping("/{confirmId}/lines")
    public ResponseEntity<InOutLineConfirm> createConfirmLine(@PathVariable Integer confirmId, @RequestBody InOutLineConfirm line) {
        line.setMInOutConfirmId(confirmId);
        return ResponseEntity.status(HttpStatus.CREATED).body(inOutConfirmService.saveLine(line));
    }

    @PutMapping("/lines/{id}")
    public ResponseEntity<InOutLineConfirm> updateConfirmLine(@PathVariable Integer id, @RequestBody InOutLineConfirm line) {
        line.setMInOutLineConfirmId(id);
        return ResponseEntity.ok(inOutConfirmService.saveLine(line));
    }
}
