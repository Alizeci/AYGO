package edu.escuelaing.aygo.model.ride;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RideResponse {
    private int rideId;
    private int userId;
    private Integer driverId;
    private String pickupLocation;
    private String destinationLocation;
    private String status;
    private String startTime;
    private String endTime;
    private String rideType;
}
