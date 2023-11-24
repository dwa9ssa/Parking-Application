package com.spring.parking.service;

import com.spring.parking.bean.Parking;
import com.spring.parking.bean.ParkingLot;
import com.spring.parking.dao.ParkingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingService {
    private ParkingDao parkingDao;
    private Parking parking;

    @Autowired
    public ParkingService(ParkingDao parkingDao) {
        this.parkingDao = parkingDao;
    }

    public List<Parking> getParking(){
        return parkingDao.findAll();
    }

    public Parking parkingInit(Parking parking){
        List<ParkingLot> parkingLots = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            ParkingLot parkingLot = new ParkingLot();
            parkingLot.setParkingLotNumber(i);
            parkingLots.add(parkingLot);
        }
        parking.setParkingLot(parkingLots);
        return parkingDao.save(parking);
    }

}
