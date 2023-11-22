package com.spring.parking.service;

import com.spring.parking.bean.CarParkingInfo;
import com.spring.parking.bean.ParkingLot;
import com.spring.parking.dao.CarParkingInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarParkingInfoService {

    private CarParkingInfoDao carParkingInfoDao;

    @Autowired
    public CarParkingInfoService(CarParkingInfoDao carParkingInfoDao) {
        this.carParkingInfoDao = carParkingInfoDao;
    }

    public List<CarParkingInfo> getCars() {
        return carParkingInfoDao.findAll();
    }
}
