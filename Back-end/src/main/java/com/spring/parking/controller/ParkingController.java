package com.spring.parking.controller;


import com.spring.parking.bean.Parking;
import com.spring.parking.dao.ParkingDao;
import com.spring.parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parking")
public class ParkingController {

    @Autowired
    private ParkingDao parkingDao;

    @Autowired
    private ParkingService parkingService;

    @GetMapping("/getParking")
    public List<Parking> getParking(){
        return parkingService.getParking();
    }

    @GetMapping("/getParkingLots")
    public String getParkingLots(){
        return parkingService.getParkingLots().toString();
    }
}
