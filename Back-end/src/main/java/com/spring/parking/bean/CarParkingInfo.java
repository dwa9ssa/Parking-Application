package com.spring.parking.bean;

import jakarta.persistence.*;

@Entity
@Table(name = "car_parking_info")
public class CarParkingInfo {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long vehicleRegistration;
    private String brand;
    private String model;
    private String color;
    private String type;
    private String entryTimestamp;
    private String finishTimestamp;
    private double totalPrice;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "parkingLotNumber", referencedColumnName = "parkingLotNumber")
    private ParkingLot parkingLot;

    public CarParkingInfo() {
    }

    public CarParkingInfo(Long vehicleRegistration, String brand, String model, String color, String type, String entryTimestamp, String finishTimestamp, double totalPrice, ParkingLot parkingLot) {
        this.vehicleRegistration = vehicleRegistration;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.type = type;
        this.entryTimestamp = entryTimestamp;
        this.finishTimestamp = finishTimestamp;
        this.totalPrice = totalPrice;
        this.parkingLot = parkingLot;
    }

    public Long getVehicleRegistration() {
        return vehicleRegistration;
    }

    public void setVehicleRegistration(Long vehicleRegistration) {
        this.vehicleRegistration = vehicleRegistration;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEntryTimestamp() {
        return entryTimestamp;
    }

    public void setEntryTimestamp(String entryTimestamp) {
        this.entryTimestamp = entryTimestamp;
    }

    public String getFinishTimestamp() {
        return finishTimestamp;
    }

    public void setFinishTimestamp(String finishTimestamp) {
        this.finishTimestamp = finishTimestamp;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public String toString() {
        return "CarParkingInfo{" +
                "vehicleRegistration='" + vehicleRegistration + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", entryTimestamp=" + entryTimestamp +
                ", finishTimestamp=" + finishTimestamp +
                ", totalPrice=" + totalPrice +
                ", parkingLot=" + parkingLot +
                '}';
    }
}
