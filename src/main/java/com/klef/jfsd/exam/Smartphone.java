package com.klef.jfsd.exam;

import javax.persistence.Entity;

@Entity
public class Smartphone extends Device {
    private String operatingSystem;
    private double cameraResolution;


    public Smartphone() {}

    public Smartphone(String brand, String model, double price, String operatingSystem, double cameraResolution) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
        this.cameraResolution = cameraResolution;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}
