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
        return parkingDao.findById(1L).orElse(null);
    }
}
