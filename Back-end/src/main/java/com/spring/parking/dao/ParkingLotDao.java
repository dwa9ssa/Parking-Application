package com.spring.parking.dao;

import com.spring.parking.entity.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotDao extends JpaRepository<ParkingLot, Long> {

}
