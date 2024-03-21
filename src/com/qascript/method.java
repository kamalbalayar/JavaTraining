package com.qascript;

import java.net.SocketOption;

public class method {
    public static void main(String[] args) {
        addNumber(4, 5);
        addNumber(4, 4);
        addNumber(3, 5);
        addNumber(9, 5);

//        using return methods
        int result = addNumber(6,3);
        int output = result + 5;
        System.out.println("Increment the OutPut: " + output);
    }
//change the void to int while using Int for return
    public static int addNumber(int num1, int num2) {
        int res = num1 + num2;
        System.out.println("Addition of two number:" + res);

        return res;

    }
}
