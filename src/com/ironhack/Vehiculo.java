package com.ironhack;

public class Vehiculo {
    
    private String brand;
    private String model;

    public Vehiculo(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Vehiculo(String brand) {
        this.brand = brand;
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
}
