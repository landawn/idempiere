package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.Shipper;
import org.idempiere.model.FreightCategory;
import org.idempiere.model.Freight;
import org.idempiere.model.Package;
import org.idempiere.model.PackageLine;
import org.idempiere.service.ShippingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller for Shipping operations.
 */
@RestController
@RequestMapping("/api/shipping")
public class ShippingController {

    private final ShippingService shippingService;

    public ShippingController(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    // Shipper endpoints
    @GetMapping("/shippers/{id}")
    public ResponseEntity<Shipper> getShipperById(@PathVariable Integer id) {
        return shippingService.findShipperById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/shippers/client/{clientId}")
    public ResponseEntity<List<Shipper>> getShippersByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(shippingService.findShippersByClient(clientId));
    }

    @GetMapping("/shippers/name")
    public ResponseEntity<Shipper> getShipperByName(@RequestParam String name, @RequestParam Integer clientId) {
        return shippingService.findShipperByName(name, clientId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/shippers/bpartner/{bpartnerId}")
    public ResponseEntity<List<Shipper>> getShippersByBPartner(@PathVariable Integer bpartnerId) {
        return ResponseEntity.ok(shippingService.findShippersByBPartner(bpartnerId));
    }

    @PostMapping("/shippers")
    public ResponseEntity<Shipper> createShipper(@RequestBody Shipper shipper) {
        return ResponseEntity.status(HttpStatus.CREATED).body(shippingService.saveShipper(shipper));
    }

    @PutMapping("/shippers/{id}")
    public ResponseEntity<Shipper> updateShipper(@PathVariable Integer id, @RequestBody Shipper shipper) {
        if (!shippingService.shipperExists(id)) {
            return ResponseEntity.notFound().build();
        }
        shipper.setMShipperId(id);
        return ResponseEntity.ok(shippingService.saveShipper(shipper));
    }

    @DeleteMapping("/shippers/{id}")
    public ResponseEntity<Void> deleteShipper(@PathVariable Integer id) {
        if (!shippingService.shipperExists(id)) {
            return ResponseEntity.notFound().build();
        }
        shippingService.deleteShipper(id);
        return ResponseEntity.noContent().build();
    }

    // FreightCategory endpoints
    @GetMapping("/freight-categories/{id}")
    public ResponseEntity<FreightCategory> getFreightCategoryById(@PathVariable Integer id) {
        return shippingService.findFreightCategoryById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/freight-categories/client/{clientId}")
    public ResponseEntity<List<FreightCategory>> getFreightCategoriesByClient(@PathVariable Integer clientId) {
        return ResponseEntity.ok(shippingService.findFreightCategoriesByClient(clientId));
    }

    @PostMapping("/freight-categories")
    public ResponseEntity<FreightCategory> createFreightCategory(@RequestBody FreightCategory freightCategory) {
        return ResponseEntity.status(HttpStatus.CREATED).body(shippingService.saveFreightCategory(freightCategory));
    }

    @PutMapping("/freight-categories/{id}")
    public ResponseEntity<FreightCategory> updateFreightCategory(@PathVariable Integer id, @RequestBody FreightCategory freightCategory) {
        if (!shippingService.findFreightCategoryById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        freightCategory.setMFreightCategoryId(id);
        return ResponseEntity.ok(shippingService.saveFreightCategory(freightCategory));
    }

    // Freight endpoints
    @GetMapping("/freight/{id}")
    public ResponseEntity<Freight> getFreightById(@PathVariable Integer id) {
        return shippingService.findFreightById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/freight/shipper/{shipperId}")
    public ResponseEntity<List<Freight>> getFreightByShipper(@PathVariable Integer shipperId) {
        return ResponseEntity.ok(shippingService.findFreightByShipper(shipperId));
    }

    @GetMapping("/freight/category/{freightCategoryId}")
    public ResponseEntity<List<Freight>> getFreightByCategory(@PathVariable Integer freightCategoryId) {
        return ResponseEntity.ok(shippingService.findFreightByFreightCategory(freightCategoryId));
    }

    @GetMapping("/freight/lookup")
    public ResponseEntity<Freight> getFreight(
            @RequestParam Integer shipperId,
            @RequestParam Integer countryId,
            @RequestParam(required = false) Integer regionId) {
        return shippingService.findFreight(shipperId, countryId, regionId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/freight")
    public ResponseEntity<Freight> createFreight(@RequestBody Freight freight) {
        return ResponseEntity.status(HttpStatus.CREATED).body(shippingService.saveFreight(freight));
    }

    @PutMapping("/freight/{id}")
    public ResponseEntity<Freight> updateFreight(@PathVariable Integer id, @RequestBody Freight freight) {
        if (!shippingService.findFreightById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        freight.setMFreightId(id);
        return ResponseEntity.ok(shippingService.saveFreight(freight));
    }

    // Package endpoints
    @GetMapping("/packages/{id}")
    public ResponseEntity<Package> getPackageById(@PathVariable Integer id) {
        return shippingService.findPackageById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/packages/inout/{inOutId}")
    public ResponseEntity<List<Package>> getPackagesByInOut(@PathVariable Integer inOutId) {
        return ResponseEntity.ok(shippingService.findPackagesByInOut(inOutId));
    }

    @GetMapping("/packages/tracking")
    public ResponseEntity<Package> getPackageByTrackingNo(@RequestParam String trackingNo) {
        return shippingService.findPackageByTrackingNo(trackingNo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/packages")
    public ResponseEntity<Package> createPackage(@RequestBody Package pkg) {
        return ResponseEntity.status(HttpStatus.CREATED).body(shippingService.savePackage(pkg));
    }

    @PutMapping("/packages/{id}")
    public ResponseEntity<Package> updatePackage(@PathVariable Integer id, @RequestBody Package pkg) {
        if (!shippingService.findPackageById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        pkg.setMPackageId(id);
        return ResponseEntity.ok(shippingService.savePackage(pkg));
    }

    // PackageLine endpoints
    @GetMapping("/packages/{packageId}/lines")
    public ResponseEntity<List<PackageLine>> getPackageLines(@PathVariable Integer packageId) {
        return ResponseEntity.ok(shippingService.findPackageLinesByPackage(packageId));
    }

    @PostMapping("/packages/{packageId}/lines")
    public ResponseEntity<PackageLine> createPackageLine(@PathVariable Integer packageId, @RequestBody PackageLine line) {
        line.setMPackageId(packageId);
        return ResponseEntity.status(HttpStatus.CREATED).body(shippingService.savePackageLine(line));
    }

    @PutMapping("/packages/lines/{id}")
    public ResponseEntity<PackageLine> updatePackageLine(@PathVariable Integer id, @RequestBody PackageLine line) {
        line.setMPackageLineId(id);
        return ResponseEntity.ok(shippingService.savePackageLine(line));
    }
}
