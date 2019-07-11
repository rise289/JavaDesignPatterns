package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class CrossCountry extends MountainBike {
    public CrossCountry(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    } //end method

    public CrossCountry(WheelInterface wheel) {
        this(wheel, BikeColor.ORANGE);
    } //end method

    @Override
    public float getPrice(){
        return 850.00f;
    } //end method
} //end class
