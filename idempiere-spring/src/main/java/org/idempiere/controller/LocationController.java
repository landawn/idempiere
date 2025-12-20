package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Location;
import org.idempiere.model.Country;
import org.idempiere.model.Region;
import org.idempiere.model.City;
import org.idempiere.service.LocationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Location entity operations.
 */
@RestController
@RequestMapping("/api/locations")
@Tag(name = "Location", description = "Location management APIs")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    // Location endpoints

    @GetMapping
    @Operation(summary = "Get all locations")
    public ResponseEntity<List<Location>> findAll() {
        return ResponseEntity.ok(locationService.findAll());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get location by ID")
    public ResponseEntity<Location> findById(@PathVariable Integer id) {
        return locationService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/country/{countryId}")
    @Operation(summary = "Get locations by country")
    public ResponseEntity<List<Location>> findByCountry(@PathVariable Integer countryId) {
        return ResponseEntity.ok(locationService.findByCountry(countryId));
    }

    @GetMapping("/region/{regionId}")
    @Operation(summary = "Get locations by region")
    public ResponseEntity<List<Location>> findByRegion(@PathVariable Integer regionId) {
        return ResponseEntity.ok(locationService.findByRegion(regionId));
    }

    @GetMapping("/city/{city}")
    @Operation(summary = "Get locations by city name")
    public ResponseEntity<List<Location>> findByCity(@PathVariable String city) {
        return ResponseEntity.ok(locationService.findByCity(city));
    }

    @PostMapping
    @Operation(summary = "Create a new location")
    public ResponseEntity<Location> create(@RequestBody Location location) {
        Location saved = locationService.save(location);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update an existing location")
    public ResponseEntity<Location> update(@PathVariable Integer id, @RequestBody Location location) {
        if (!locationService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        location.setCLocationId(id);
        Location updated = locationService.save(location);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete a location")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        if (!locationService.exists(id)) {
            return ResponseEntity.notFound().build();
        }
        locationService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Country endpoints

    @GetMapping("/countries")
    @Operation(summary = "Get all countries")
    public ResponseEntity<List<Country>> findAllCountries() {
        return ResponseEntity.ok(locationService.findAllCountries());
    }

    @GetMapping("/countries/{id}")
    @Operation(summary = "Get country by ID")
    public ResponseEntity<Country> findCountryById(@PathVariable Integer id) {
        return locationService.findCountryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/countries/code/{countryCode}")
    @Operation(summary = "Get country by ISO code")
    public ResponseEntity<Country> findCountryByCode(@PathVariable String countryCode) {
        return locationService.findCountryByCode(countryCode)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/countries/default")
    @Operation(summary = "Get default country")
    public ResponseEntity<Country> findDefaultCountry() {
        return locationService.findDefaultCountry()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Region endpoints

    @GetMapping("/countries/{countryId}/regions")
    @Operation(summary = "Get all regions for a country")
    public ResponseEntity<List<Region>> findRegionsByCountry(@PathVariable Integer countryId) {
        return ResponseEntity.ok(locationService.findRegionsByCountry(countryId));
    }

    @GetMapping("/countries/{countryId}/regions/name/{name}")
    @Operation(summary = "Get region by name")
    public ResponseEntity<Region> findRegionByName(@PathVariable Integer countryId, @PathVariable String name) {
        return locationService.findRegionByName(name, countryId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // City endpoints

    @GetMapping("/regions/{regionId}/cities")
    @Operation(summary = "Get all cities for a region")
    public ResponseEntity<List<City>> findCitiesByRegion(@PathVariable Integer regionId) {
        return ResponseEntity.ok(locationService.findCitiesByRegion(regionId));
    }

    @GetMapping("/countries/{countryId}/cities")
    @Operation(summary = "Get all cities for a country")
    public ResponseEntity<List<City>> findCitiesByCountry(@PathVariable Integer countryId) {
        return ResponseEntity.ok(locationService.findCitiesByCountry(countryId));
    }
}
