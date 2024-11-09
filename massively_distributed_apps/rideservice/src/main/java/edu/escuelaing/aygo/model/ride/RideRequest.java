package edu.escuelaing.aygo.model.ride;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RideRequest {
    private int rideId;
    private int userId;
    private int driverId;
    private String pickupLocation;
    private String destinationLocation;
    private String status;
    private String startTime;
    private String endTime;
    private String rideType;

}
