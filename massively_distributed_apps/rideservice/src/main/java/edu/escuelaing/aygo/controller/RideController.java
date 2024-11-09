package edu.escuelaing.aygo.controller;

import edu.escuelaing.aygo.model.ride.CancelRideResponse;
import edu.escuelaing.aygo.model.ride.RideRequest;
import edu.escuelaing.aygo.model.ride.RideResponse;
import edu.escuelaing.aygo.model.ride.RideStatusResponse;
import edu.escuelaing.aygo.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/rides")
public class RideController {

    private final RideService rideService;

    @Autowired
    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    @PostMapping
    public ResponseEntity<RideResponse> createRideRequest(@RequestBody RideRequest rideRequest) {
        RideResponse rideResponse = rideService.createRideRequest(rideRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(rideResponse);
    }

    @PutMapping("/{rideId}/cancel")
    public ResponseEntity<CancelRideResponse> cancelRideRequest(@PathVariable int rideId) {
        CancelRideResponse response = rideService.cancelRideRequest(rideId);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{rideId}/status")
    public ResponseEntity<RideStatusResponse> getRideStatus(@PathVariable int rideId) {
        RideStatusResponse response = rideService.getRideStatus(rideId);
        return ResponseEntity.ok(response);
    }
}
