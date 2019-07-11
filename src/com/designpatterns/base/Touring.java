package com.designpatterns.base;

import com.designpatterns.java.BikeColor;

public class Touring extends RoadBike {
    public Touring(WheelInterface wheel, BikeColor color){
        super(wheel,color);
    } //end method

    public Touring(WheelInterface wheel){
        this(wheel, BikeColor.BLUE);
    } //end method

    @Override
    public float getPrice(){
        return 570.00f;
    } //end method
} //end class
