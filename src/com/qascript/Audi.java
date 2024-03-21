package com.qascript;

public class Audi {
    public static void main(String[] args) {
// ClassObject is parent class and Audi is child class.
        ClassObject audi = new ClassObject();
        audi.setColor("red");
        audi.setSize(60);
        audi.setWeight(50.44);
        audi.displayClassObject();

        ClassObject.accelerate();
        ClassObject.start();

        displayLogo("Nepal");
        displayLogo(100);


    }
    public static void  displayLogo(String s1){
        System.out.println("Logo is: " + s1);
    }
//    public static void displayLogo(String s1, String s2)
    public static void displayLogo(int s){
        System.out.println("Logo is : "+ s);

    }
}
