package com.spring.parking.service;

import com.spring.parking.bean.Parking;
import com.spring.parking.dao.ParkingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingService {
    private ParkingDao parkingDao;

    @Autowired
    public ParkingService(ParkingDao parkingDao) {
        this.parkingDao = parkingDao;
    }

    public List<Parking> getParking(){
        return parkingDao.findAll();
    }

    public Parking parkingInit(Parking parking){
        return parkingDao.save(parking);
    }

}
