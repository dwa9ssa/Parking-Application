package com.spring.parking.service;

import com.spring.parking.bean.CarParkingInfo;
import com.spring.parking.dao.CarParkingInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarParkingInfoService {

    private CarParkingInfoDao carParkingInfoDao;

    @Autowired
    public CarParkingInfoService(CarParkingInfoDao carParkingInfoDao) {
        this.carParkingInfoDao = carParkingInfoDao;
    }

    public void updateCar(Long vehicleRegistration, CarParkingInfo carParkingInfo){
        carParkingInfo.setBrand(carParkingInfo.getBrand());
        carParkingInfo.setModel(carParkingInfo.getModel());
        carParkingInfo.setColor(carParkingInfo.getColor());
        carParkingInfo.setType(carParkingInfo.getType());
        carParkingInfo.setEntryTime(carParkingInfo.getEntryTime());
        carParkingInfoDao.save(carParkingInfo);
    }

    public void deleteCar(CarParkingInfo car){
        carParkingInfoDao.delete(car);
    }

    public void save(CarParkingInfo carParkingInfo){
        carParkingInfoDao.save(carParkingInfo);
    }
}
