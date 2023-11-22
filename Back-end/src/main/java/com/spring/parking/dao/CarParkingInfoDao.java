package com.spring.parking.dao;

import com.spring.parking.bean.CarParkingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CarParkingInfoDao extends JpaRepository<CarParkingInfo, Long> {

}
