package edu.escuelaing.aygo.service;

import edu.escuelaing.aygo.model.Driver;

public interface DriverService {
    Driver registerDriver(Driver driver);

    Driver updateDriverStatus(Long driverId, String newStatus);

    Driver getDriverInfo(Long driverId);
}
