package edu.escuelaing.aygo.service;

import edu.escuelaing.aygo.model.ride.CancelRideResponse;
import edu.escuelaing.aygo.model.ride.RideRequest;
import edu.escuelaing.aygo.model.ride.RideResponse;
import edu.escuelaing.aygo.model.ride.RideStatusResponse;

public interface RideService {
    RideResponse createRideRequest(RideRequest rideRequest);
    CancelRideResponse cancelRideRequest(int rideId);
    RideStatusResponse getRideStatus(int rideId);
}
