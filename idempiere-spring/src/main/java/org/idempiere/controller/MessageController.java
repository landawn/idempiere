package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Message;
import org.idempiere.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Message entity operations.
 */
@RestController
@RequestMapping("/api/messages")
@Tag(name = "Message", description = "Message management APIs")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    @Operation(summary = "Get all messages")
    public ResponseEntity<List<Message>> findAll() {
        return ResponseEntity.ok(messageService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get message by ID")
    public ResponseEntity<Message> findById(@PathVariable Integer id) {
        return messageService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @Operation(summary = "Create a new message")
    public ResponseEntity<Message> create(@RequestBody Message message) {
        Message saved = messageService.save(message);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing message")
    public ResponseEntity<Message> update(@PathVariable Integer id, @RequestBody Message message) {
        if (!messageService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        message.setAdMessageId(id);
        Message updated = messageService.save(message);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a message")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!messageService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        messageService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
