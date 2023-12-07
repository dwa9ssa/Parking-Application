package com.spring.parking.dto;

import com.spring.parking.entity.CarParkingInfo;
import com.spring.parking.entity.Parking;
import lombok.*;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingLotDto {
    private long parkingLotNumber;
    private CarParkingInfo carParkingInfo;
    private Parking parking;
    private double price;

//    public static ParkingLotDto convertToParkingLotDto(ParkingLot parkingLotEntity){
//        return ParkingLotDto.builder()
//                .parkingLotNumber(parkingLotEntity.getParkingLotNumber())
//                .carParkingInfo(parkingLotEntity.getCarParkingInfo())
//                .parking(parkingLotEntity.getParking())
//                .price(parkingLotEntity.getPrice())
//                .build();
//    }
}
