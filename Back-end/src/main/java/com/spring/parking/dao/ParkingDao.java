package com.spring.parking.dao;

import com.spring.parking.entity.Parking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingDao extends JpaRepository<Parking, Long> {
}
