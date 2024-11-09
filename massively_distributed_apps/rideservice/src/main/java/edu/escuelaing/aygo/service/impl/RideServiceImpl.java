package edu.escuelaing.aygo.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.escuelaing.aygo.aws.sqs.SQSProvider;
import edu.escuelaing.aygo.model.ride.CancelRideResponse;
import edu.escuelaing.aygo.model.ride.RideRequest;
import edu.escuelaing.aygo.model.ride.RideResponse;
import edu.escuelaing.aygo.model.ride.RideStatusResponse;
import edu.escuelaing.aygo.service.RideService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RideServiceImpl implements RideService {

    private final SQSProvider sqsProvider;
    private final ObjectMapper objectMapper;

    @Autowired
    public RideServiceImpl(SQSProvider sqsProvider, ObjectMapper objectMapper) {
        this.sqsProvider = sqsProvider;
        this.objectMapper = objectMapper;
    }

    @Override
    public RideResponse createRideRequest(RideRequest rideRequest) {
        log.info("Creating ride request for user: {}", rideRequest.getUserId());
        RideResponse rideResponse = new RideResponse(
                12345,
                rideRequest.getUserId(),
                null,
                rideRequest.getPickupLocation(),
                rideRequest.getDestinationLocation(),
                "requested",
                null,
                null,
                rideRequest.getRideType()
        );

        String messageBody = convertToJson(rideRequest);
        sqsProvider.sendMessage(messageBody);

        return rideResponse;
    }

    @Override
    public CancelRideResponse cancelRideRequest(int rideId) {
        return new CancelRideResponse(rideId, "canceled", "Ride request has been successfully canceled.");
    }

    @Override
    public RideStatusResponse getRideStatus(int rideId) {
        return new RideStatusResponse(rideId, "in_progress", "789 Pine St");
    }

    private String convertToJson(RideRequest rideRequest) {
        try {
            return objectMapper.writeValueAsString(rideRequest);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error al convertir RideRequest a JSON", e);
        }
    }
}