package com.example.nordic_motorhome.Model;

public class Rental {
    int rental_id;
    int customer_id;
    int motorhome_id;
    String rentalStart;
    String rentalEnd;
    int bikeRack;
    int bedLinen;
    int chairs;
    int picnicTable;
    int childSeat;
    String pickup;
    String dropoff;
    int kmStart;
    String season;

    public Rental(int rental_id, int customer_id, int motorhome_id, String rentalStart, String rentalEnd, int bikeRack, int bedLinen, int chairs, int picnicTable, int childSeat, String pickup, String dropoff, int kmStart, String season) {
        this.rental_id = rental_id;
        this.customer_id = customer_id;
        this.motorhome_id = motorhome_id;
        this.rentalStart = rentalStart;
        this.rentalEnd = rentalEnd;
        this.bikeRack = bikeRack;
        this.bedLinen = bedLinen;
        this.chairs = chairs;
        this.picnicTable = picnicTable;
        this.childSeat = childSeat;
        this.pickup = pickup;
        this.dropoff = dropoff;
        this.kmStart = kmStart;
        this.season = season;
    }

    public int getRental_id() {
        return rental_id;
    }

    public void setRental_id(int rental_id) {
        this.rental_id = rental_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getMotorhome_id() {
        return motorhome_id;
    }

    public void setMotorhome_id(int motorhome_id) {
        this.motorhome_id = motorhome_id;
    }

    public String getRentalStart() {
        return rentalStart;
    }

    public void setRentalStart(String rentalStart) {
        this.rentalStart = rentalStart;
    }

    public String getRentalEnd() {
        return rentalEnd;
    }

    public void setRentalEnd(String rentalEnd) {
        this.rentalEnd = rentalEnd;
    }

    public int getBikeRack() {
        return bikeRack;
    }

    public void setBikeRack(int bikeRack) {
        this.bikeRack = bikeRack;
    }

    public int getBedLinen() {
        return bedLinen;
    }

    public void setBedLinen(int bedLinen) {
        this.bedLinen = bedLinen;
    }

    public int getChairs() {
        return chairs;
    }

    public void setChairs(int chairs) {
        this.chairs = chairs;
    }

    public int getPicnicTable() {
        return picnicTable;
    }

    public void setPicnicTable(int picnicTable) {
        this.picnicTable = picnicTable;
    }

    public int getChildSeat() {
        return childSeat;
    }

    public void setChildSeat(int childSeat) {
        this.childSeat = childSeat;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDropoff() {
        return dropoff;
    }

    public void setDropoff(String dropoff) {
        this.dropoff = dropoff;
    }

    public int getKmStart() {
        return kmStart;
    }

    public void setKmStart(int kmStart) {
        this.kmStart = kmStart;
    }
    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

}
