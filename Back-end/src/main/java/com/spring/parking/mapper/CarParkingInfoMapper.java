package com.spring.parking.mapper;


import com.spring.parking.dto.CarParkingInfoDto;
import com.spring.parking.entity.CarParkingInfo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarParkingInfoMapper {
    CarParkingInfo toCarParkingInfoEntity(CarParkingInfoDto carParkingInfoDto);
    CarParkingInfoDto toCarParkingInfoDto(CarParkingInfo carParkingInfo);
}
