package com.spring.parking.controller;

import com.spring.parking.bean.ParkingLot;
import com.spring.parking.dao.ParkingDao;
import com.spring.parking.dao.ParkingLotDao;
import com.spring.parking.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/parking/ParkingLot",method = {RequestMethod.POST,RequestMethod.DELETE})
public class ParkingLotsController {


    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping("/getParkingLots")
    public List<ParkingLot> getParkingLot(){
        return parkingLotService.getParkingLot();
    }

    @DeleteMapping("/{parkingLotNumber}")
    public void deleteCarParkingInfoById(@PathVariable("parkingLotNumber") Long parkingLotNumber){
        parkingLotService.deleteCarParkingInfo(parkingLotNumber);
    }

    @PostMapping("/postParkingLot")
    public void addNewCarParkingInfo(@RequestBody ParkingLot parkingLot){
        parkingLotService.addNewCarParkingInfo(parkingLot);
    }

    @PutMapping("/{parkingLotNumber}")
    public void updateCar(@PathVariable("parkingLotNumber") Long parkingLotNumber,@RequestBody ParkingLot parkingLot){
        parkingLotService.updateCarParkingInfo(parkingLotNumber,parkingLot);
    }


}
