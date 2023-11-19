package com.spring.parking.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="parking_lot")
public class ParkingLot {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long parkingLotNumber;
    private String carParkingInfo;

    @ManyToOne
    @JoinColumn(name = "parking_id")
    private Parking parking;

    public ParkingLot() {

    }

    public ParkingLot(long parkingLotNumber, String carParkingInfo, Parking parking) {
        this.parkingLotNumber = parkingLotNumber;
        this.carParkingInfo = carParkingInfo;
        this.parking = parking;
    }

    public long getParkingLotNumber() {
        return parkingLotNumber;
    }

    public void setParkingLotNumber(long parkingLotNumber) {
        this.parkingLotNumber = parkingLotNumber;
    }

    public String getCarParkingInfo() {
        return carParkingInfo;
    }

    public void setCarParkingInfo(String carParkingInfo) {
        this.carParkingInfo = carParkingInfo;
    }

    public Parking getParking() {
        return parking;
    }

    public void setParking(Parking parking) {
        this.parking = parking;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "parkingLotNumber=" + parkingLotNumber +
                ", carParkingInfo='" + carParkingInfo + '\'' +
                ", parking=" + parking +
                '}';
    }
}
