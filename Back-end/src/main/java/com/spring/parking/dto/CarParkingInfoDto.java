package com.spring.parking.dto;

import lombok.*;


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

//    public static CarParkingInfoDto convertToCarParkingInfoDto(CarParkingInfo carParkingInfoEntity){
//        return CarParkingInfoDto.builder()
//                .vehicleRegistration(carParkingInfoEntity.getVehicleRegistration())
//                .brand(carParkingInfoEntity.getBrand())
//                .model(carParkingInfoEntity.getModel())
//                .color(carParkingInfoEntity.getColor())
//                .type(carParkingInfoEntity.getType())
//                .entryTime(carParkingInfoEntity.getEntryTime())
//                .totalPrice(carParkingInfoEntity.getTotalPrice())
//                .build();
//    }

}
