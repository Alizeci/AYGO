package edu.escuelaing.aygo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Driver {
    private int driverId;
    private String name;
    private String vehicleType;
    private String vehicleLicenseNumber;
    private double rating;
    private String location;
    private String availabilityStatus;
}
