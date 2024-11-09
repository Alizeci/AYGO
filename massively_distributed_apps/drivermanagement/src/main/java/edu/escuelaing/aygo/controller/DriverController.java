package edu.escuelaing.aygo.controller;

import edu.escuelaing.aygo.model.Driver;
import edu.escuelaing.aygo.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drivers")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @PostMapping
    public ResponseEntity<Driver> registerDriver(@RequestBody Driver driver) {
        Driver registeredDriver = driverService.registerDriver(driver);
        return ResponseEntity.ok(registeredDriver);
    }

    @PatchMapping("/{driverId}/status")
    public ResponseEntity<?> updateDriverStatus(@PathVariable("driverId") Long driverId,
                                                @RequestBody String availabilityStatus) {
        Driver updatedDriver = driverService.updateDriverStatus(driverId, availabilityStatus);
        return ResponseEntity.ok("Driver status updated successfully: " + updatedDriver.getAvailabilityStatus());
    }

    @GetMapping("/{driverId}")
    public ResponseEntity<Driver> getDriverInfo(@PathVariable("driverId") Long driverId) {
        Driver driver = driverService.getDriverInfo(driverId);
        return ResponseEntity.ok(driver);
    }
}