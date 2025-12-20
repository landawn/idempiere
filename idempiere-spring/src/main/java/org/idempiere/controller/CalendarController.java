package org.idempiere.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.Calendar;
import org.idempiere.model.Year;
import org.idempiere.model.Period;
import org.idempiere.service.CalendarService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Calendar entity operations.
 */
@RestController
@RequestMapping("/api/calendars")
@Tag(name = "Calendar", description = "Calendar management APIs")
public class CalendarController {

    private final CalendarService calendarService;

    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    // Calendar endpoints

    @GetMapping
    @Operation(summary = "Get all calendars")
    public ResponseEntity<List<Calendar>> findAll() {
        return ResponseEntity.ok(calendarService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get calendar by ID")
    public ResponseEntity<Calendar> findById(@PathVariable Integer id) {
        return calendarService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/client/{clientId}")
    @Operation(summary = "Get calendars by client")
    public ResponseEntity<List<Calendar>> findByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(calendarService.findByClient(clientId));
    }

    @PostMapping
    @Operation(summary = "Create a new calendar")
    public ResponseEntity<Calendar> create(@RequestBody Calendar calendar) {
        Calendar saved = calendarService.save(calendar);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing calendar")
    public ResponseEntity<Calendar> update(@PathVariable Integer id, @RequestBody Calendar calendar) {
        if (!calendarService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        calendar.setCCalendarId(id);
        Calendar updated = calendarService.save(calendar);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a calendar")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!calendarService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        calendarService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Year endpoints

    @GetMapping("/{calendarId}/years")
    @Operation(summary = "Get all years for a calendar")
    public ResponseEntity<List<Year>> findYearsByCalendar(@PathVariable Integer calendarId) {
        return ResponseEntity.ok(calendarService.findYearsByCalendar(calendarId));
    }

    @PostMapping("/{calendarId}/years")
    @Operation(summary = "Create a new year for calendar")
    public ResponseEntity<Year> createYear(@PathVariable Integer calendarId, @RequestBody Year year) {
        year.setCCalendarId(calendarId);
        Year saved = calendarService.saveYear(year);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    // Period endpoints

    @GetMapping("/years/{yearId}/periods")
    @Operation(summary = "Get all periods for a year")
    public ResponseEntity<List<Period>> findPeriodsByYear(@PathVariable Integer yearId) {
        return ResponseEntity.ok(calendarService.findPeriodsByYear(yearId));
    }

    @GetMapping("/{calendarId}/periods/date")
    @Operation(summary = "Find period by date")
    public ResponseEntity<Period> findPeriodByDate(
            @PathVariable Integer calendarId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dateAcct) {
        return calendarService.findPeriodByDate(dateAcct, calendarId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/years/{yearId}/periods")
    @Operation(summary = "Create a new period for year")
    public ResponseEntity<Period> createPeriod(@PathVariable Integer yearId, @RequestBody Period period) {
        period.setCYearId(yearId);
        Period saved = calendarService.savePeriod(period);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
