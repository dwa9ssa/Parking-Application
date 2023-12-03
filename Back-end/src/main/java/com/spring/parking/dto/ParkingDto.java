package com.spring.parking.dto;

import com.spring.parking.entity.Parking;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParkingDto {
    private long id;
    private String openTime;
    private String closeTime;

    public static ParkingDto convertToParkingDto(Parking parkingEntity){
        return ParkingDto.builder()
                .id(parkingEntity.getId())
                .openTime(parkingEntity.getOpenTime())
                .closeTime(parkingEntity.getClosetime())
                .build();
    }
}
