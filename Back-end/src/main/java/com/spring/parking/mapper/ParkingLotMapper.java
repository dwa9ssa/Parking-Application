package com.spring.parking.mapper;


import com.spring.parking.dto.ParkingLotDto;
import com.spring.parking.entity.ParkingLot;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ParkingLotMapper {
    ParkingLot toParkingLotEntity(ParkingLotDto parkingLotDto);
    ParkingLotDto toParkingLotDto(ParkingLot parkingLot);
}
