package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.AttributeSet;
import org.idempiere.model.Attribute;
import org.idempiere.model.AttributeSetInstance;
import org.idempiere.model.AttributeInstance;
import org.idempiere.service.AttributeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Attribute operations.
 */
@RestController
@RequestMapping("/api/attributes")
public class AttributeController {

    private final AttributeService attributeService;

    public AttributeController(AttributeService attributeService) {
        this.attributeService = attributeService;
    }

    // AttributeSet endpoints
    @GetMapping("/sets/{id}")
    public ResponseEntity<AttributeSet> getAttributeSetById(@PathVariable Integer id) {
        return attributeService.findAttributeSetById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/sets/client/{clientId}")
    public ResponseEntity<List<AttributeSet>> getAttributeSetsByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(attributeService.findAttributeSetsByClient(clientId));
    }

    @GetMapping("/sets/name")
    public ResponseEntity<AttributeSet> getAttributeSetByName(@RequestParam String name, @RequestParam Integer clientId) {
        return attributeService.findAttributeSetByName(name, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/sets")
    public ResponseEntity<AttributeSet> createAttributeSet(@RequestBody AttributeSet attributeSet) {
        return ResponseEntity.status(HttpStatus.CREATED).body(attributeService.saveAttributeSet(attributeSet));
    }

    @PutMapping("/sets/{id}")
    public ResponseEntity<AttributeSet> updateAttributeSet(@PathVariable Integer id, @RequestBody AttributeSet attributeSet) {
        if (!attributeService.findAttributeSetById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        attributeSet.setMAttributeSetId(id);
        return ResponseEntity.ok(attributeService.saveAttributeSet(attributeSet));
    }

    // Attribute endpoints
    @GetMapping("/{id}")
    public ResponseEntity<Attribute> getAttributeById(@PathVariable Integer id) {
        return attributeService.findAttributeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/set/{attributeSetId}")
    public ResponseEntity<List<Attribute>> getAttributesBySet(@PathVariable Integer attributeSetId) {
        return ResponseEntity.ok(attributeService.findAttributesByAttributeSet(attributeSetId));
    }

    @PostMapping
    public ResponseEntity<Attribute> createAttribute(@RequestBody Attribute attribute) {
        return ResponseEntity.status(HttpStatus.CREATED).body(attributeService.saveAttribute(attribute));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Attribute> updateAttribute(@PathVariable Integer id, @RequestBody Attribute attribute) {
        if (!attributeService.findAttributeById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        attribute.setMAttributeId(id);
        return ResponseEntity.ok(attributeService.saveAttribute(attribute));
    }

    // AttributeSetInstance endpoints
    @GetMapping("/instances/{id}")
    public ResponseEntity<AttributeSetInstance> getASIById(@PathVariable Integer id) {
        return attributeService.findASIById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/instances/set/{attributeSetId}")
    public ResponseEntity<List<AttributeSetInstance>> getASIsBySet(@PathVariable Integer attributeSetId) {
        return ResponseEntity.ok(attributeService.findASIsByAttributeSet(attributeSetId));
    }

    @PostMapping("/instances")
    public ResponseEntity<AttributeSetInstance> createASI(@RequestBody AttributeSetInstance asi) {
        return ResponseEntity.status(HttpStatus.CREATED).body(attributeService.saveASI(asi));
    }

    @PutMapping("/instances/{id}")
    public ResponseEntity<AttributeSetInstance> updateASI(@PathVariable Integer id, @RequestBody AttributeSetInstance asi) {
        if (!attributeService.findASIById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        asi.setMAttributeSetInstanceId(id);
        return ResponseEntity.ok(attributeService.saveASI(asi));
    }

    // AttributeInstance endpoints
    @GetMapping("/instances/{asiId}/values")
    public ResponseEntity<List<AttributeInstance>> getAttributeInstancesByASI(@PathVariable Integer asiId) {
        return ResponseEntity.ok(attributeService.findAttributeInstancesByASI(asiId));
    }

    @PostMapping("/instances/values")
    public ResponseEntity<AttributeInstance> createAttributeInstance(@RequestBody AttributeInstance instance) {
        return ResponseEntity.status(HttpStatus.CREATED).body(attributeService.saveAttributeInstance(instance));
    }
}
