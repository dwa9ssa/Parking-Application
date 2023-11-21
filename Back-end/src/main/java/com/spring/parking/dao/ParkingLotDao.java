package com.spring.parking.dao;

import com.spring.parking.bean.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ParkingLotDao extends JpaRepository<ParkingLot, Long> {

}
