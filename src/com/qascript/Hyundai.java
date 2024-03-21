package com.qascript;

// while inheritance class write extends and Name of Parent Class
public class Hyundai  extends ClassObject{

    public static void main(String[] args) {
        start();
        accelerate();
        brakes();
    }

    public static void brakes() {
        System.out.println("Press the Brakes");
    }
// overRide the Start but when we starts
    public static void start() {
        String key = "ON";
        System.out.println("Turn the Key" + ' ' + key);

    }

}
//Creating Abstract Class
abstract class Bike{
    abstract void run();
    void brake(){
        System.out.println("apply brakes");
    }
}
