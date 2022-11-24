package org.sda.java19.models;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Vehicle {
    private String brand;
    private String model;
    private BigDecimal price;
}