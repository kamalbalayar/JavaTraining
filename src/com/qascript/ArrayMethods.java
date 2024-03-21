package com.qascript;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int arr[] = {2,4,5,6,3,10};
        int arr2[] = {3,5,6,7,2,4};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println("length of Array: "+ arr.length);
        System.out.println("sorted Array:" + Arrays.toString(arr)+ ' ' + Arrays.toString(arr2));

        if(arr.equals(arr2)){
            System.out.println("Arrays are equal");

        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
