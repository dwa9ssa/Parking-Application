package com.spring.parking.dto;

import java.time.LocalDateTime;

public class CarParkingInfoDto {
    private long vehicleRegistration;
    private String brand;
    private String model;
    private String color;
    private String type;
    private LocalDateTime entryTime;
    private double totalPrice;
}
