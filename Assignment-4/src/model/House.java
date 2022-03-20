/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arjun
 */
public class House {
    private int houseNumber;
    private String address;
    private String pinCode;
    private String city;

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
    private String community;

//    public int getPinCode() {
//        return pinCode;
//    }
//
//    public void setPinCode(int pinCode) {
//        this.pinCode = pinCode;
//    }
    

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public int getPostalCode() {
//        return postalCode;
//    }
//
//    public void setPostalCode(int postalCode) {
//        this.postalCode = postalCode;
//    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
    
}
