package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Lot;
import org.idempiere.model.LotCtl;
import org.idempiere.model.SerNoCtl;
import org.idempiere.service.LotService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Lot and Serial Number Control operations.
 */
@RestController
@RequestMapping("/api/lots")
public class LotController {

    private final LotService lotService;

    public LotController(LotService lotService) {
        this.lotService = lotService;
    }

    // Lot endpoints
    @GetMapping("/{id}")
    public ResponseEntity<Lot> getLotById(@PathVariable Integer id) {
        return lotService.findLotById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/product/{productId}")
    public ResponseEntity<List<Lot>> getLotsByProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(lotService.findLotsByProduct(productId));
    }

    @GetMapping("/name")
    public ResponseEntity<Lot> getLotByName(@RequestParam String name, @RequestParam Integer productId) {
        return lotService.findLotByName(name, productId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<Lot>> getLotsByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(lotService.findLotsByClient(clientId));
    }

    @PostMapping
    public ResponseEntity<Lot> createLot(@RequestBody Lot lot) {
        return ResponseEntity.status(HttpStatus.CREATED).body(lotService.saveLot(lot));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lot> updateLot(@PathVariable Integer id, @RequestBody Lot lot) {
        if (!lotService.findLotById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        lot.setMLotId(id);
        return ResponseEntity.ok(lotService.saveLot(lot));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLot(@PathVariable Integer id) {
        if (!lotService.findLotById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        lotService.deleteLot(id);
        return ResponseEntity.noContent().build();
    }

    // LotCtl endpoints
    @GetMapping("/controls/{id}")
    public ResponseEntity<LotCtl> getLotCtlById(@PathVariable Integer id) {
        return lotService.findLotCtlById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/controls/client/{clientId}")
    public ResponseEntity<List<LotCtl>> getLotCtlsByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(lotService.findLotCtlsByClient(clientId));
    }

    @GetMapping("/controls/name")
    public ResponseEntity<LotCtl> getLotCtlByName(@RequestParam String name, @RequestParam Integer clientId) {
        return lotService.findLotCtlByName(name, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/controls")
    public ResponseEntity<LotCtl> createLotCtl(@RequestBody LotCtl lotCtl) {
        return ResponseEntity.status(HttpStatus.CREATED).body(lotService.saveLotCtl(lotCtl));
    }

    @PutMapping("/controls/{id}")
    public ResponseEntity<LotCtl> updateLotCtl(@PathVariable Integer id, @RequestBody LotCtl lotCtl) {
        if (!lotService.findLotCtlById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        lotCtl.setMLotCtlId(id);
        return ResponseEntity.ok(lotService.saveLotCtl(lotCtl));
    }

    @DeleteMapping("/controls/{id}")
    public ResponseEntity<Void> deleteLotCtl(@PathVariable Integer id) {
        if (!lotService.findLotCtlById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        lotService.deleteLotCtl(id);
        return ResponseEntity.noContent().build();
    }

    // SerNoCtl endpoints
    @GetMapping("/serial-controls/{id}")
    public ResponseEntity<SerNoCtl> getSerNoCtlById(@PathVariable Integer id) {
        return lotService.findSerNoCtlById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/serial-controls/client/{clientId}")
    public ResponseEntity<List<SerNoCtl>> getSerNoCtlsByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(lotService.findSerNoCtlsByClient(clientId));
    }

    @GetMapping("/serial-controls/name")
    public ResponseEntity<SerNoCtl> getSerNoCtlByName(@RequestParam String name, @RequestParam Integer clientId) {
        return lotService.findSerNoCtlByName(name, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/serial-controls")
    public ResponseEntity<SerNoCtl> createSerNoCtl(@RequestBody SerNoCtl serNoCtl) {
        return ResponseEntity.status(HttpStatus.CREATED).body(lotService.saveSerNoCtl(serNoCtl));
    }

    @PutMapping("/serial-controls/{id}")
    public ResponseEntity<SerNoCtl> updateSerNoCtl(@PathVariable Integer id, @RequestBody SerNoCtl serNoCtl) {
        if (!lotService.findSerNoCtlById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        serNoCtl.setMSerNoCtlId(id);
        return ResponseEntity.ok(lotService.saveSerNoCtl(serNoCtl));
    }

    @DeleteMapping("/serial-controls/{id}")
    public ResponseEntity<Void> deleteSerNoCtl(@PathVariable Integer id) {
        if (!lotService.findSerNoCtlById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        lotService.deleteSerNoCtl(id);
        return ResponseEntity.noContent().build();
    }
}
