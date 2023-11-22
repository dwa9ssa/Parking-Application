package com.spring.parking.configuration;

import com.spring.parking.bean.Parking;
import com.spring.parking.bean.ParkingLot;
import com.spring.parking.dao.ParkingDao;
import com.spring.parking.dao.ParkingLotDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class ParkingConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(ParkingDao parkingDao, ParkingLotDao parkingLotDao){
        return args -> {
            Parking parking = new Parking();
            ParkingLot parkingLot = new ParkingLot();

            if (!parkingDataExists(parkingDao)) {
                parking.setPricePerplacePerminute(2);
                parking.setOpenTime("7:00");
                parking.setClosetime("12:00");

                parkingDao.save(parking);
            }
        };
    }


    private boolean parkingDataExists(ParkingDao parkingDao){
        return parkingDao.count() > 0;
    }

    }
