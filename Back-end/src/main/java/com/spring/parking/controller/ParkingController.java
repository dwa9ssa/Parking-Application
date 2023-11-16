package com.spring.parking.controller;


import com.spring.parking.bean.Parking;
import com.spring.parking.dao.ParkingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/parking")
public class ParkingController {

    @Autowired
    private ParkingDao parkingDao;

    @GetMapping("/getParking")
    public Parking getParking(){
        Parking parking = new Parking();
        parking.setPricePerplacePerminute(5);
        parking.setOpenTime("7:00");
        parking.setClosetime("12:00");

        List<String> newParkingLot = Arrays.asList("Lot 1", "Lot 2", "Lot 3");
        String parkingLotCSV = String.join(",", newParkingLot);

        parking.setParkingLot(parkingLotCSV);
        parkingDao.save(parking);
        return parking;
    }

}
