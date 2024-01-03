package com.spring.parking.serviceTest;

import com.spring.parking.dao.CarParkingInfoDao;
import com.spring.parking.dao.ParkingLotDao;
import com.spring.parking.dto.CarParkingInfoDto;
import com.spring.parking.entity.CarParkingInfo;
import com.spring.parking.entity.ParkingLot;
import com.spring.parking.mapper.CarParkingInfoMapper;
import com.spring.parking.mapper.ParkingLotMapper;
import com.spring.parking.service.CarParkingInfoService;
import com.spring.parking.service.ParkingLotService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class ServiceTest {

    @InjectMocks
    private ParkingLotService parkingLotService;

    @Mock
    ParkingLotDao parkingLotDao;

    @Mock
    CarParkingInfoService carParkingInfoService;

    @Mock
    ParkingLotMapper parkingLotMapper;

    @Mock
    CarParkingInfoMapper carParkingInfoMapper;
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCarService(){
        ParkingLot parkingLot = new ParkingLot();
        CarParkingInfo carParkingInfo = new CarParkingInfo();

        Optional<ParkingLot> opparkingLot = Optional.ofNullable(parkingLot);

        CarParkingInfoDto carParkingInfoDto = CarParkingInfoDto.builder()
                .vehicleRegistration(1L)
                .brand("TestBrand")
                .color("TestColor")
                .type("TestType")
                .totalPrice(10)
                .build();


        when(parkingLotDao.findById(1L)).thenReturn(opparkingLot);
        when(carParkingInfoMapper.toCarParkingInfoEntity(carParkingInfoDto)).thenReturn(carParkingInfo);

        parkingLotService.parkingCar(1L, carParkingInfoDto);

        assertNotNull(carParkingInfo.getVehicleRegistration());
    }



}
