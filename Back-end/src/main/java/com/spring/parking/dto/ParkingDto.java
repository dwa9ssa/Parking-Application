package com.spring.parking.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingDto {
    private long id;
    private String openTime;
    private String closeTime;
    @JsonProperty("parkingLotNumber")
    private List<ParkingLotDto> parkingLots;

//    public static ParkingDto convertToParkingDto(Parking parkingEntity){
//        return ParkingDto.builder()
//                .id(parkingEntity.getId())
//                .openTime(parkingEntity.getOpenTime())
//                .closeTime(parkingEntity.getClosetime())
//                .build();
//    }
}
