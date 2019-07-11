package com.designpatterns.decorator;

import com.designpatterns.base.BikeInterface;

public class GoldFrameOption extends AbstractBikeOption {

    public GoldFrameOption(BikeInterface bike){ super(bike);} //Constructor

    @Override
    public float getPrice() {
        return decoratedBike.getPrice() + 300.00F;
    } //end method

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " ("+ getWheel()+ ", Gold Price = $" + getPrice()+ ")";
    } //end method
} //end class
