package com.spring.parking.dao;

import com.spring.parking.bean.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingDao extends JpaRepository<Parking, Long> {
}
