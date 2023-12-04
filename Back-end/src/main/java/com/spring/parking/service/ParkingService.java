package com.spring.parking.service;

import com.spring.parking.dto.ParkingDto;
import com.spring.parking.entity.Parking;
import com.spring.parking.dao.ParkingDao;
import com.spring.parking.entity.ParkingLot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ParkingService {
    private ParkingDao parkingDao;
    @Autowired
    public ParkingService(ParkingDao parkingDao) {
        this.parkingDao = parkingDao;
    }

    public List<Parking> getParking(){
        return parkingDao.findAll();
    }

    public ParkingDto parkingInit(Parking parking){
        for (ParkingLot parkingLot : parking.getParkingLots()) {
            parkingLot.setParking(parking);
        }
        return ParkingDto.convertToParkingDto(parkingDao.save(parking));
    }

}
