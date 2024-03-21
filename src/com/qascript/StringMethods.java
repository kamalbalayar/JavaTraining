package com.qascript;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "learning Java";
        String s2 = "Basics";

        String s3 = s1 + s2;
// string start position form 0

        System.out.println("Length of string: " + s3.length());
        System.out.println("LowerCase" + s3.toLowerCase());
        System.out.println("UpperCase: " + s3.toUpperCase());
        System.out.println("Get Char:" + s3.indexOf("J"));
        System.out.println(("GetPosition:" + s3.charAt(5)));
    }
}
