package com.spring.parking.controller;

import com.spring.parking.bean.ParkingLot;
import com.spring.parking.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parking")
public class ParkingLotsController {


    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping("/parkingLots")
    public List<ParkingLot> getParkingLot(){
        return parkingLotService.getParkingLot();
    }

    @DeleteMapping("/unparkingCar/{parkingLotNumber}")
    public void unparkingCar(@PathVariable("parkingLotNumber") Long parkingLotNumber){
        parkingLotService.unparkingCar(parkingLotNumber);
    }

    @PostMapping("/parkCar")
    public void parkingCar(@RequestBody ParkingLot parkingLot){
        parkingLotService.parkingCar(parkingLot);
    }

}
