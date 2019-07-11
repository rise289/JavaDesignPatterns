package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class Vintage extends RoadBike {
    public Vintage(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    } //end method

    public Vintage(WheelInterface wheel) {
        this(wheel, BikeColor.RED);
    } //end method

    @Override
    public float getPrice(){
        return 600.00f;
    } //end method
} //end class
