package edu.escuelaing.aygo.model.ride;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CancelRideRequest {
    private int rideId;
    private int userId;
}
