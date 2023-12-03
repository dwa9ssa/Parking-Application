package com.spring.parking.dto;

import com.spring.parking.entity.CarParkingInfo;
import com.spring.parking.entity.Parking;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingLotDto {
    private long parkingLotNumber;
    private CarParkingInfo carParkingInfo;
    private Parking parking;
    private double price;
}
