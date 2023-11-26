package com.spring.parking.controller;

import com.spring.parking.bean.CarParkingInfo;
import com.spring.parking.bean.ParkingLot;
import com.spring.parking.model.UnparkCarRequest;
import com.spring.parking.service.CarParkingInfoService;
import com.spring.parking.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/parking")
public class ParkingLotsController {


    @Autowired
    private ParkingLotService parkingLotService;

    @Autowired
    private CarParkingInfoService carParkingInfoService;

    @GetMapping("/parkingLots")
    public List<ParkingLot> getParkingLot(){
        return parkingLotService.getParkingLot();
    }

    @DeleteMapping("/unparkingCar/{parkingLotNumber}")
    public CarParkingInfo unparkingCar(@PathVariable("parkingLotNumber") Long parkingLotNumber, @RequestBody UnparkCarRequest unparkCarRequest){
        ParkingLot parkingLot = parkingLotService.findParkingLotById(parkingLotNumber);
        CarParkingInfo car = parkingLot.getCarParkingInfo();
        LocalDateTime start = car.getEntryTime();
        LocalDateTime finish = unparkCarRequest.getFinishTime();
        long durationMinutes = java.time.Duration.between(start, finish).toMinutes();
        double finalPrice = durationMinutes * parkingLot.getPrice();
        car.setTotalPrice(finalPrice);
        parkingLot.setCarParkingInfo(null);
        carParkingInfoService.deleteCar(car);
        parkingLotService.save(parkingLot);
        return car;
    }

    @PostMapping("/parkCar/{parkingLotNumber}")
    public void parkingCar(@PathVariable("parkingLotNumber") Long parkingLotNumber, @RequestBody CarParkingInfo carParkingInfo){
        ParkingLot parkingLot = parkingLotService.findParkingLotById(parkingLotNumber);
        parkingLot.setCarParkingInfo(carParkingInfo);
        parkingLotService.save(parkingLot);
    }

}
