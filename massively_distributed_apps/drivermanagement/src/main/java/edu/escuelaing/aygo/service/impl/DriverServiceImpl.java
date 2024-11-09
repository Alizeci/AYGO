package edu.escuelaing.aygo.service.impl;

import edu.escuelaing.aygo.model.Driver;
import edu.escuelaing.aygo.service.DriverService;

public class DriverServiceImpl implements DriverService {
    @Override
    public Driver registerDriver(Driver driver) {
        driver.setDriverId(54321L);
        driver.setRating(5.0);
        driver.setAvailabilityStatus("available");
        return driver;
    }

    @Override
    public Driver updateDriverStatus(Long driverId, String newStatus) {
        Driver driver = new Driver();
        driver.setDriverId(driverId);
        driver.setAvailabilityStatus(newStatus);
        return driver;
    }

    @Override
    public Driver getDriverInfo(Long driverId) {
        Driver driver = new Driver();
        driver.setDriverId(driverId);
        driver.setName("John Doe");
        driver.setVehicleType("SUV");
        driver.setVehicleLicenseNumber("ABC123");
        driver.setLocation("123 Main St");
        driver.setRating(4.7);
        driver.setAvailabilityStatus("available");
        return driver;
    }
}
