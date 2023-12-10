package com.spring.parking.dao;

import com.spring.parking.entity.CarParkingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarParkingInfoDao extends JpaRepository<CarParkingInfo, Long> {

    CarParkingInfo findByVehicleRegistration(Long vehicleRegistration);

}
