package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Archive;
import org.idempiere.service.ArchiveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Archive operations.
 */
@RestController
@RequestMapping("/api/archives")
public class ArchiveController {

    private final ArchiveService archiveService;

    public ArchiveController(ArchiveService archiveService) {
        this.archiveService = archiveService;
    }

    @GetMapping
    public ResponseEntity<List<Archive>> getAllArchives() {
        return ResponseEntity.ok(archiveService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Archive> getArchiveById(@PathVariable Integer id) {
        return archiveService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<Archive>> getArchivesByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(archiveService.findByClient(clientId));
    }

    @GetMapping("/record")
    public ResponseEntity<List<Archive>> getArchivesByRecord(@RequestParam Integer tableId, @RequestParam Integer recordId) {
        return ResponseEntity.ok(archiveService.findByRecord(tableId, recordId));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Archive>> getArchivesByUser(@PathVariable Integer userId) {
        return ResponseEntity.ok(archiveService.findByUser(userId));
    }

    @GetMapping("/bpartner/{bpartnerId}")
    public ResponseEntity<List<Archive>> getArchivesByBPartner(@PathVariable Integer bpartnerId) {
        return ResponseEntity.ok(archiveService.findByBPartner(bpartnerId));
    }

    @PostMapping
    public ResponseEntity<Archive> createArchive(@RequestBody Archive archive) {
        return ResponseEntity.status(HttpStatus.CREATED).body(archiveService.save(archive));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Archive> updateArchive(@PathVariable Integer id, @RequestBody Archive archive) {
        if (!archiveService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        archive.setAdArchiveId(id);
        return ResponseEntity.ok(archiveService.save(archive));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteArchive(@PathVariable Integer id) {
        if (!archiveService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        archiveService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
