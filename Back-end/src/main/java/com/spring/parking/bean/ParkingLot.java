package com.spring.parking.bean;

import jakarta.persistence.*;

@Entity
@Table(name="parking_lot")
public class ParkingLot {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long parkingLotNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicle_registration")
    private CarParkingInfo carParkingInfo;

    @ManyToOne
    @JoinColumn(name = "parking_id")
    private Parking parking;

    private double price;

    public ParkingLot() {

    }

    public ParkingLot(long parkingLotNumber, CarParkingInfo carParkingInfo, Parking parking, double price) {
        this.parkingLotNumber = parkingLotNumber;
        this.carParkingInfo = carParkingInfo;
        this.parking = parking;
        this.price = price;
    }

    public long getParkingLotNumber() {
        return parkingLotNumber;
    }

    public void setParkingLotNumber(long parkingLotNumber) {
        this.parkingLotNumber = parkingLotNumber;
    }

    public CarParkingInfo getCarParkingInfo() {
        return carParkingInfo;
    }

    public void setCarParkingInfo(CarParkingInfo carParkingInfo) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
