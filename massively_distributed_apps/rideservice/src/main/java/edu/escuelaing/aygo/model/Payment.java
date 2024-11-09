package edu.escuelaing.aygo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment {
    private int paymentId;
    private int userId;
    private int rideId;
    private double amount;
    private String paymentMethod;
    private String status;
    private String paymentTime;
}
