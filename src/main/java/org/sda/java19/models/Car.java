package org.sda.java19.models;

import lombok.Data;

@Data
public class Car extends Motorcycle {
    private VehicleTransmission vehicleTransmission;
}