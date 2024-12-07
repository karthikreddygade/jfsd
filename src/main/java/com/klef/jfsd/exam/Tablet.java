package com.klef.jfsd.exam;

import javax.persistence.Entity;

@Entity
public class Tablet extends Device {
    private double screenSize;
    private int batteryLife;
    public Tablet() {}

    public Tablet(String brand, String model, double price, double screenSize, int batteryLife) {
        super(brand, model, price);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}
