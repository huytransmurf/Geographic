/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LAPTOP ACER
 */
public class Country {

    protected String countryCode;
    protected String countryName;
    protected float totalArea;

    public Country() {
    }

    public Country(String countryCode, String countryName, float totalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.totalArea = totalArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }
    public void display(){
        System.out.println(String.format("%15s | %15s | %7f ", countryName,countryCode,totalArea));
    }
}
