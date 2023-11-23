package com.spring.parking.controller;

import com.spring.parking.bean.CarParkingInfo;
import com.spring.parking.dao.CarParkingInfoDao;
import com.spring.parking.service.CarParkingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/parking/ParkingLot/CarParkingInfo")
public class CarParkingInfoController {
    @Autowired
    private CarParkingInfoDao carParkingInfoDao;

    @Autowired
    private CarParkingInfoService carParkingInfoService;

    @GetMapping("/Cars")
    public List<CarParkingInfo> getCars(){
        return carParkingInfoService.getCars();
    }

    @PutMapping("/{vehicleRegistration}")
    public void updateCarParkingInfo(@PathVariable("vehicleRegistration") String vehicleRegistration, @RequestBody CarParkingInfo carParkingInfo){
        carParkingInfoService.updateCar(vehicleRegistration, carParkingInfo);
    }

    @PostMapping("/Car")
    public void addNewCar(@RequestBody CarParkingInfo carParkingInfo){
        carParkingInfoService.addCar(carParkingInfo);
    }

    @DeleteMapping("/{vehicleRegistration}")
    public void deleteCar(@PathVariable("vehicleRegistration") String vehicleRegistration){
        carParkingInfoService.deleteCar(vehicleRegistration);
    }

}
