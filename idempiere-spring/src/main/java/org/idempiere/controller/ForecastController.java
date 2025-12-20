package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Forecast;
import org.idempiere.model.ForecastLine;
import org.idempiere.service.ForecastService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Forecast operations.
 */
@RestController
@RequestMapping("/api/forecasts")
public class ForecastController {

    private final ForecastService forecastService;

    public ForecastController(ForecastService forecastService) {
        this.forecastService = forecastService;
    }

    @GetMapping
    public ResponseEntity<List<Forecast>> getAllForecasts() {
        return ResponseEntity.ok(forecastService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Forecast> getForecastById(@PathVariable Integer id) {
        return forecastService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<Forecast>> getForecastsByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(forecastService.findByClient(clientId));
    }

    @GetMapping("/name")
    public ResponseEntity<Forecast> getForecastByName(@RequestParam String name, @RequestParam Integer clientId) {
        return forecastService.findByName(name, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/default/client/{clientId}")
    public ResponseEntity<Forecast> getDefaultForecast(@PathVariable Integer clientId) {
        return forecastService.findDefault(clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/calendar/{calendarId}")
    public ResponseEntity<List<Forecast>> getForecastsByCalendar(@PathVariable Integer calendarId) {
        return ResponseEntity.ok(forecastService.findByCalendar(calendarId));
    }

    @PostMapping
    public ResponseEntity<Forecast> createForecast(@RequestBody Forecast forecast) {
        return ResponseEntity.status(HttpStatus.CREATED).body(forecastService.save(forecast));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Forecast> updateForecast(@PathVariable Integer id, @RequestBody Forecast forecast) {
        if (!forecastService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        forecast.setMForecastId(id);
        return ResponseEntity.ok(forecastService.save(forecast));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteForecast(@PathVariable Integer id) {
        if (!forecastService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        forecastService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // ForecastLine endpoints
    @GetMapping("/{forecastId}/lines")
    public ResponseEntity<List<ForecastLine>> getForecastLines(@PathVariable Integer forecastId) {
        return ResponseEntity.ok(forecastService.findLinesByForecast(forecastId));
    }

    @GetMapping("/lines/product/{productId}")
    public ResponseEntity<List<ForecastLine>> getForecastLinesByProduct(@PathVariable Integer productId) {
        return ResponseEntity.ok(forecastService.findLinesByProduct(productId));
    }

    @GetMapping("/lines/period/{periodId}")
    public ResponseEntity<List<ForecastLine>> getForecastLinesByPeriod(@PathVariable Integer periodId) {
        return ResponseEntity.ok(forecastService.findLinesByPeriod(periodId));
    }

    @PostMapping("/{forecastId}/lines")
    public ResponseEntity<ForecastLine> createForecastLine(@PathVariable Integer forecastId, @RequestBody ForecastLine line) {
        line.setMForecastId(forecastId);
        return ResponseEntity.status(HttpStatus.CREATED).body(forecastService.saveLine(line));
    }

    @PutMapping("/lines/{id}")
    public ResponseEntity<ForecastLine> updateForecastLine(@PathVariable Integer id, @RequestBody ForecastLine line) {
        line.setMForecastLineId(id);
        return ResponseEntity.ok(forecastService.saveLine(line));
    }
}
