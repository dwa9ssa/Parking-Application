package com.spring.parking.controller;

import com.spring.parking.bean.ParkingLot;
import com.spring.parking.dao.ParkingLotDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/parking/ParkingLot")
public class ParkingLotsController {

    @Autowired
    private ParkingLotDao parkingLotDao;

    @GetMapping("/getCars")
    public String getCars(){
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setCarParkingInfo("First Car");
        parkingLotDao.save(parkingLot);
        return parkingLot.getCarParkingInfo();
    }

}
