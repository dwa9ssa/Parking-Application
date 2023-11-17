package com.spring.parking.service;

import com.spring.parking.bean.Parking;
import com.spring.parking.dao.ParkingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<String> getParkingLots() {
        List<Parking> parkingList = parkingDao.findAll();
        return parkingList.stream()
                .map(Parking::getParkingLot)
                .collect(Collectors.toList());
    }

}
