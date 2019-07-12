package com.designpatterns.observer;

import java.util.Observable;

public class Speedometer extends Observable {
    private int currentSpeed;

    public Speedometer(){ //Constructors
        currentSpeed = 0;
    } //end constructor

    public int getCurrentSpeed(){  //getter
        return currentSpeed;
    } //end getter

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;

        setChanged();
        notifyObservers();
    } //end method
} //end class
