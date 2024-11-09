package edu.escuelaing.aygo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String paymentMethod;
    private double rating;
    private String location;
}
