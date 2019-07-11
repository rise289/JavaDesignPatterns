package com.designpatterns.singleton;
/*A Singleton Pattern ensures that a class only have one object
be created to provide a single point of access.
 */
public class SerialNumberGenerator {
    private static SerialNumberGenerator instance;
    private int count = 642135;

    public synchronized static SerialNumberGenerator getInstance() {
        if(instance == null) {
            instance = new SerialNumberGenerator();
        } // end if statement
        return instance;
    } //end method

    private SerialNumberGenerator() {}
    public synchronized int getNextSerial() {return ++ count;}



} //end class
