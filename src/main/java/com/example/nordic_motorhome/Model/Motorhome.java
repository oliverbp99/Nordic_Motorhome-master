package com.example.nordic_motorhome.Model;

public class Motorhome {
    int motorhome_id;
    String brand;
    String model;
    char type;

    public Motorhome(int motorhome_id, String brand, String model, char type) {
        this.motorhome_id = motorhome_id;
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    public int getMotorhome_id() {
        return motorhome_id;
    }

    public void setMotorhome_id(int motorhome_id) {
        this.motorhome_id = motorhome_id;
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

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
