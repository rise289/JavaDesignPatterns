package com.designpatterns.behavioral;

import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.CrossCountry;
import com.designpatterns.base.DownHill;
import com.designpatterns.base.WideWheel;

import java.util.Arrays;
import java.util.Iterator;

public class MountainBikeRange implements Iterable<BikeInterface> {
    private BikeInterface[] bikes;

    public MountainBikeRange(){  // Constructor
        bikes = new BikeInterface[5];

        bikes[0] = new DownHill(new WideWheel(22));
        bikes[1] = new DownHill(new WideWheel(24));
        bikes[2] = new CrossCountry(new WideWheel(26));
        bikes[3] = new CrossCountry(new WideWheel(24));
        bikes[4] = new CrossCountry(new WideWheel(22));
    } //end constructor

    public BikeInterface[] getRange(){ //getter
        return bikes;
    } //end getter

    @Override
    public Iterator<BikeInterface> iterator() {
        return Arrays.asList(bikes).listIterator();//Converts the array into a list
    }
} //end class
