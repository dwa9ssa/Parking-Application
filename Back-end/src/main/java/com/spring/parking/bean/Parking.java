package com.spring.parking.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class Parking {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    private double pricePerplacePerminute;
    private String openTime;
    private String closetime;
    private String parkingLot;

    public Parking() {
    }

    public Parking(long id, double pricePerplacePerminute, String openTime, String closetime, String parkingLot) {
        this.id = id;
        this.pricePerplacePerminute = pricePerplacePerminute;
        this.openTime = openTime;
        this.closetime = closetime;
        this.parkingLot = parkingLot;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPricePerplacePerminute() {
        return pricePerplacePerminute;
    }

    public void setPricePerplacePerminute(double pricePerplacePerminute) {
        this.pricePerplacePerminute = pricePerplacePerminute;
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

    public String getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(String parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "id=" + id +
                ", pricePerplacePerminute=" + pricePerplacePerminute +
                ", openTime='" + openTime + '\'' +
                ", closetime='" + closetime + '\'' +
                ", parkingLot=" + parkingLot +
                '}';
    }
}
