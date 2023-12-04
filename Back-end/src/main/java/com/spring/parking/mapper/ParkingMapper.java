package com.spring.parking.mapper;

import com.spring.parking.dto.ParkingDto;
import com.spring.parking.entity.Parking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ParkingMapper {
    Parking toParkingEntity(ParkingDto parkingDto);
    ParkingDto toParkingDto(Parking parking);
}
