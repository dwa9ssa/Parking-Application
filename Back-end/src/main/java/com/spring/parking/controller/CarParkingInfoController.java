package com.spring.parking.controller;

import com.spring.parking.bean.CarParkingInfo;
import com.spring.parking.dao.CarParkingInfoDao;
import com.spring.parking.service.CarParkingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/parking")
public class CarParkingInfoController {
    @Autowired
    private CarParkingInfoDao carParkingInfoDao;

    @Autowired
    private CarParkingInfoService carParkingInfoService;

    @PutMapping("/updateCar/{vehicleRegistration}")
    public void updateCarParkingInfo(@PathVariable Long vehicleRegistration, @RequestBody CarParkingInfo carParkingInfo){
        carParkingInfoService.updateCar(vehicleRegistration, carParkingInfo);
    }

}
