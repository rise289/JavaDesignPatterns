package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class DownHill extends MountainBike {
    public DownHill(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    } //end method

    public DownHill(WheelInterface wheel) {
        this(wheel, BikeColor.GREEN);
    } //end method

    @Override
    public float getPrice(){
        return 870.00f;
    } //end method
} //end class
