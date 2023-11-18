package com.spring.parking.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="parking_lot")
public class ParkingLot {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long parkingLotNumber;
    private List<String> carParkingInfo;

    public ParkingLot() {
    }

    public ParkingLot(long parkingLotNumber, List<String> carParkingInfo) {
        this.parkingLotNumber = parkingLotNumber;
        this.carParkingInfo = carParkingInfo;
    }

    public long getParkingLotNumber() {
        return parkingLotNumber;
    }

    public void setParkingLotNumber(long parkingLotNumber) {
        this.parkingLotNumber = parkingLotNumber;
    }

    public List<String> getCarParkingInfo() {
        return carParkingInfo;
    }

    public void setCarParkingInfo(List<String> carParkingInfo) {
        this.carParkingInfo = carParkingInfo;
    }
}
