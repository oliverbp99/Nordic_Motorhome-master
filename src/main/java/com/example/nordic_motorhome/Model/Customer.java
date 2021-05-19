package com.example.nordic_motorhome.Model;

public class Customer {
    int customer_id;
    String first_name;
    String last_name;
    String email;
    int phoneNumber;
    String address;
    int zip_code;
    String city;
    int driverLicenseNum;


    public Customer(int customer_id, String first_name, String last_name, String email, int phoneNumber, String address, int zip_code, String city, int driverLicenseNum) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.zip_code = zip_code;
        this.city = city;
        this.driverLicenseNum = driverLicenseNum;
    }

    public Customer(){

    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDriverLicenseNum() {
        return driverLicenseNum;
    }

    public void setDriverLicenseNum(int driverLicenseNum) {
        this.driverLicenseNum = driverLicenseNum;
    }
}
