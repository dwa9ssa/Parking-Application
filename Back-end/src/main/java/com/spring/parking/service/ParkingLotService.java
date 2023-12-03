package com.spring.parking.service;

import com.spring.parking.dto.CarParkingInfoDto;
import com.spring.parking.dto.ParkingLotDto;
import com.spring.parking.entity.CarParkingInfo;
import com.spring.parking.entity.ParkingLot;
import com.spring.parking.dao.ParkingLotDao;
import com.spring.parking.model.UnparkCarRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ParkingLotService {

    private ParkingLotDao parkingLotDao;

    private CarParkingInfoService carParkingInfoService;

    @Autowired
    public ParkingLotService(ParkingLotDao parkingLotDao, CarParkingInfoService carParkingInfoService) {
        this.parkingLotDao = parkingLotDao;
        this.carParkingInfoService = carParkingInfoService;
    }

    public List<ParkingLot> getParkingLots() {
        return parkingLotDao.findAll();
    }

    public ParkingLotDto getParkingLot(Long parkingLotNumber){
        return ParkingLotDto.convertToParkingLotDto(parkingLotDao.findById(parkingLotNumber).get());
    }

    public CarParkingInfoDto unparkingCar(Long parkingLotNumber, UnparkCarRequest unparkCarRequest){
        ParkingLot parkingLot = findParkingLotById(parkingLotNumber);
        CarParkingInfo car = parkingLot.getCarParkingInfo();
        LocalDateTime start = car.getEntryTime();
        LocalDateTime finish = unparkCarRequest.getFinishTime();
        long durationMinutes = java.time.Duration.between(start, finish).toMinutes();
        double finalPrice = durationMinutes * parkingLot.getPrice();
        car.setTotalPrice(finalPrice);
        parkingLot.setCarParkingInfo(null);
        carParkingInfoService.deleteCar(car);
        parkingLotDao.save(parkingLot);
        return CarParkingInfoDto.convertToCarParkingInfoDto(car);
    }

    public ParkingLot findParkingLotById(Long parkingLotId){
        return parkingLotDao.findById(parkingLotId).get();
    }

    public void parkingCar(Long parkingLotNumber,CarParkingInfo carParkingInfo){
        ParkingLot parkingLot = findParkingLotById(parkingLotNumber);
        parkingLot.setCarParkingInfo(carParkingInfo);
        parkingLotDao.save(parkingLot);
    }

}
