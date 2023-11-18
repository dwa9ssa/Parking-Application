package com.spring.parking.controller;

import com.spring.parking.bean.ParkingLot;
import com.spring.parking.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parking/ParkingLot")
public class ParkingLotsController {


    @Autowired
    private ParkingLotService parkingLotService;

    @GetMapping("/getParkingLot")
    public List<ParkingLot> getParkingLot(){
        return parkingLotService.getParkingLot();
    }
}
