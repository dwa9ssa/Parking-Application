package com.spring.parking.dto;

import com.spring.parking.entity.CarParkingInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarParkingInfoDto {
    private long vehicleRegistration;
    private String brand;
    private String model;
    private String color;
    private String type;
    private LocalDateTime entryTime;
    private double totalPrice;
}
