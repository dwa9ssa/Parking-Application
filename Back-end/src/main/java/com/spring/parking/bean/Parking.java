package com.spring.parking.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Parking {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long parking_id;

    private String openTime;
    private String closetime;

    @OneToMany(mappedBy = "parking", cascade = CascadeType.ALL)
    private List<ParkingLot> parkingLot;

    public Parking() {
    }

    public Parking(long parking_id, String openTime, String closetime, List<ParkingLot> parkingLot) {
        this.parking_id = parking_id;

        this.openTime = openTime;
        this.closetime = closetime;
        this.parkingLot = parkingLot;
    }

    public long getParking_id() {
        return parking_id;
    }

    public void setParking_id(long parking_id) {
        this.parking_id = parking_id;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getClosetime() {
        return closetime;
    }

    public void setClosetime(String closetime) {
        this.closetime = closetime;
    }

    public List<ParkingLot> getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(List<ParkingLot> parkingLot) {
        this.parkingLot = parkingLot;
    }
}
