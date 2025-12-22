package org.dsa.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayIsSorted {

    // Brute Force Approach
//    public static boolean isSorted(int[] arr) {
//        for(int i =0 ;i<arr.length;i++){
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] > arr[j])
//                    return false;
//            }
//        }
//        return true;
//    }

    // Optimal Approach
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr));
    }
}
