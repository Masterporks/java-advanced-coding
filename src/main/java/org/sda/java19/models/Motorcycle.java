package org.sda.java19.models;

import lombok.Data;

@Data
public class Motorcycle extends Vehicle {
    private float topSpeed;
    private VehicleShape vehicleShape;
}