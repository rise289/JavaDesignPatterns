package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public abstract class MountainBike extends AbstractBike {

    protected MountainBike(WheelInterface wheel, BikeColor color){
        super(wheel, color);
    } //end method

    protected MountainBike(WheelInterface wheel){
        this(wheel, BikeColor.CHROME);
    } //end method

    @Override
    public float getPrice(){
        return 780.00f;
    } //end method
} //end class
