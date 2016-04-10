package com.rental.views.beans;

public class CarBean {
    public int ID;
    public String make;
    public String model;
    public String trim;
    public String color;
    public String vin;
    public String licenseTitle;
    public String status;
    public String location;
    public String purchaseDate;
    public String stickerValidity;
    public int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getStickerValidity() {
        return stickerValidity;
    }

    public void setStickerValidity(String stickerValidity) {
        this.stickerValidity = stickerValidity;
    }

    public int getID() {
        return ID;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getTrim() {
        return trim;
    }

    public String getColor() {
        return color;
    }

    public String getVin() {
        return vin;
    }

    public String getLicenseTitle() {
        return licenseTitle;
    }

    public String getStatus() {
        return status;
    }

    public String getLocation() {
        return location;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setLicenseTitle(String licenseTitle) {
        this.licenseTitle = licenseTitle;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
