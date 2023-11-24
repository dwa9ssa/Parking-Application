package com.spring.parking.service;

import com.spring.parking.bean.ParkingLot;
import com.spring.parking.dao.ParkingLotDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingLotService {

    private ParkingLotDao parkingLotDao;

    @Autowired
    public ParkingLotService(ParkingLotDao parkingLotDao) {
        this.parkingLotDao = parkingLotDao;
    }

    public List<ParkingLot> getParkingLot() {
        return parkingLotDao.findAll();
    }

    public void unparkingCar(Long parkingLotNumber){
        parkingLotDao.deleteById(parkingLotNumber);
    }

    public void parkingCar(ParkingLot parkingLot){
        parkingLotDao.save(parkingLot);
    }

}
