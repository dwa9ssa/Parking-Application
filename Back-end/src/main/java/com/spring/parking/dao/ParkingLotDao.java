package com.spring.parking.dao;

import com.spring.parking.bean.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingLotDao extends JpaRepository<ParkingLot, Long> {

}
