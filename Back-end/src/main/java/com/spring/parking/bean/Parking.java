package com.spring.parking.bean;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Parking {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long parking_id;
    private double pricePerplacePerminute;
    private String openTime;
    private String closetime;

    @OneToMany(mappedBy = "parking", cascade = CascadeType.ALL)
    private List<ParkingLot> parkingLot;

    public Parking() {
    }

    public Parking(long parking_id, double pricePerplacePerminute, String openTime, String closetime, List<ParkingLot> parkingLot) {
        this.parking_id = parking_id;
        this.pricePerplacePerminute = pricePerplacePerminute;
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

    public List<ParkingLot> getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(List<ParkingLot> parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "parking_id=" + parking_id +
                ", pricePerplacePerminute=" + pricePerplacePerminute +
                ", openTime='" + openTime + '\'' +
                ", closetime='" + closetime + '\'' +
                ", parkingLot=" + parkingLot +
                '}';
    }
}
