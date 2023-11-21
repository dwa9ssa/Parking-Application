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

    public void deleteCarParkingInfo(Long parkingLotNumber){
        parkingLotDao.deleteById(parkingLotNumber);
    }

    public void addNewCarParkingInfo(ParkingLot parkingLot){
        parkingLotDao.save(parkingLot);
    }

    public void updateCarParkingInfo(long parkingLotNumber, ParkingLot parkingLot){
            parkingLot.setCarParkingInfo(parkingLot.getCarParkingInfo());
            parkingLotDao.save(parkingLot);
    }


}
