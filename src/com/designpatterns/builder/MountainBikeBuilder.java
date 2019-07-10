package com.designpatterns.builder;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.MountainBike;

public class MountainBikeBuilder extends BikeBuilder {

    private MountainBike bikeInProgress;
    public MountainBikeBuilder(MountainBike bike) {
        this.bikeInProgress = bike;
    }

    @Override
    public BikeInterface getBike() {
        return bikeInProgress;
    } //end method

    @Override
    public void buildHandleBars() {
        System.out.println("Building HandleBars");
    } //end method

    @Override
    public void buildWideTires() {
        System.out.println("Building Wide Tires");
    } //end method
} //end class
