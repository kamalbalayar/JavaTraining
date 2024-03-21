package com.qascript;
// name of class ClassObject
public class ClassObject {

    private String color;
    private int Size;
    private double weight;

    public static void start() {
        System.out.println("Press the start key");

    }

    public static void accelerate() {
        System.out.println("press the accelerator");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(int size) {
        Size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void displayClassObject(){
        System.out.println("Color of the car: " + color);
        System.out.println("Wight of the car: " + weight);
        System.out.println("Size of the car: " + Size);
    }

}
