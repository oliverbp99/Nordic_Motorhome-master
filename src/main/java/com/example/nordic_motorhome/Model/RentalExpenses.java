package com.example.nordic_motorhome.Model;

public class RentalExpenses extends Rental{
    double fuelLevel;
    int kmEnd;
    int pickupExtras;
    int dropoffExtras;
    String repairFee;


    public RentalExpenses(int rental_id, int customer_id, int motorhome_id, String rentalStart, String rentalEnd, int bikeRack, int bedLinen, int chairs, int picnicTable, int childSeat, String pickup, String dropoff, int kmStart, String season, double fuelLevel, int kmEnd, int pickupExtras, int dropoffExtras, String repairFee) {
        super(rental_id, customer_id, motorhome_id, rentalStart, rentalEnd, bikeRack, bedLinen, chairs, picnicTable, childSeat, pickup, dropoff, kmStart, season);
        this.fuelLevel = fuelLevel;
        this.kmEnd = kmEnd;
        this.pickupExtras = pickupExtras;
        this.dropoffExtras = dropoffExtras;
        this.repairFee = repairFee;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getKmEnd() {
        return kmEnd;
    }

    public void setKmEnd(int kmEnd) {
        this.kmEnd = kmEnd;
    }

    public int getPickupExtras() {
        return pickupExtras;
    }

    public void setPickupExtras(int pickupExtras) {
        this.pickupExtras = pickupExtras;
    }

    public int getDropoffExtras() {
        return dropoffExtras;
    }

    public void setDropoffExtras(int dropoffExtras) {
        this.dropoffExtras = dropoffExtras;
    }

    public String getRepairFee() {
        return repairFee;
    }

    public void setRepairFee(String repairFee) {
        this.repairFee = repairFee;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

}
