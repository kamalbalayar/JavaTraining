package com.qascript;
import java.util.Scanner;

public class control_flow {

    public static void main(String[] args) {
        System.out.println("Enter your number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

//        if (number > 6) {
//            System.out.println("You won the Game");
//        } else {
//            System.out.println("You have lost the Game");
//        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numbers : " + i);
        }
    }
}


