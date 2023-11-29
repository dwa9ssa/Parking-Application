package com.spring.parking.controller;

import com.spring.parking.entity.Parking;
import com.spring.parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/parking")
public class ParkingController {


    @Autowired
    private ParkingService parkingService;

    @GetMapping
    public List<Parking> getParking(){
        return parkingService.getParking();
    }

    @PostMapping("/init")
    public Parking parkingInit(@RequestBody Parking parking){
        return parkingService.parkingInit(parking);
    }
}
