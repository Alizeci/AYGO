package edu.escuelaing.aygo.model.ride;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RideStatusResponse {
    private int rideId;
    private String status;
    private String driverLocation;
}
