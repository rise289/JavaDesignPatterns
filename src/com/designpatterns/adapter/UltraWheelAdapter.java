package com.designpatterns.adapter;

import com.designpatterns.base.AbstractWheel;

public class UltraWheelAdapter extends AbstractWheel {
    public UltraWheelAdapter(UltraWheel ultrawheel){
    // public AbstractWheel(int size, boolean wide)
        super(ultrawheel.getWheelSize(), false);
    } // end method
} //end class
