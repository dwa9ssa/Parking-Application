package com.spring.parking.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Parking {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    private String openTime;
    private String closetime;

    public List<ParkingLot> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parking")
    private List<ParkingLot> parkingLots;

    public Parking() {
    }

    public Parking(long id, String openTime, String closetime) {
        this.id = id;
        this.openTime = openTime;
        this.closetime = closetime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

}
