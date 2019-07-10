package com.designpatterns.java;
import com.designpatterns.abstractfactory.*;
import com.designpatterns.base.BikeInterface;
import com.designpatterns.base.NarrowWheel;
import com.designpatterns.base.RoadBike;
import com.designpatterns.base.Touring;
import com.designpatterns.builder.BikeBuilder;
import com.designpatterns.builder.BikeDirector;
import com.designpatterns.builder.RoadBikeBuilder;
import com.designpatterns.builder.RoadBikeDirector;
import com.designpatterns.singleton.SerialNumberGenerator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        singletonExample();
        //builderExample();
    //abstractFactoryExample();
    }//end Main method

    private static void singletonExample(){
        System.out.println("Generating Serial Numbers");
        SerialNumberGenerator generator = SerialNumberGenerator.getInstance();
        System.out.println("next serial = "+generator.getNextSerial());
        System.out.println("next serial = "+generator.getNextSerial());
        System.out.println("next serial = "+generator.getNextSerial());
        System.out.println("next serial = "+generator.getNextSerial());
    } //end method

    private static void builderExample(){
        RoadBike bike = new Touring(new NarrowWheel(22));
        BikeBuilder builder = new RoadBikeBuilder(bike);
        BikeDirector director = new RoadBikeDirector();
        BikeInterface bikeInterface = director.build(builder);
        System.out.println(bikeInterface);
    } //end method

    private static void abstractFactoryExample() {
        AbstractBikeFactory factory = new RoadBikeFactory();
        BikeFrameInterface frame = factory.createFrame();
        BikeSeatInterface seat = factory.createSeat();

        System.out.println(frame.getFrameParts());
        System.out.println(seat.getSeatParts());

    }
} //end class
