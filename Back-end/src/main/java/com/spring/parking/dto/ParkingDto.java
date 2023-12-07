package com.spring.parking.dto;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingDto {
    private long id;
    private String openTime;
    private String closeTime;

//    public static ParkingDto convertToParkingDto(Parking parkingEntity){
//        return ParkingDto.builder()
//                .id(parkingEntity.getId())
//                .openTime(parkingEntity.getOpenTime())
//                .closeTime(parkingEntity.getClosetime())
//                .build();
//    }
}
