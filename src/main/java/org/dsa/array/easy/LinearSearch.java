package org.dsa.array.easy;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int k = sc.nextInt();
        System.out.println(linearSearch(arr, k));
    }

    public static int linearSearch(int[] arr, int k){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(k == arr[i])
                return i;
        }
        return -1;
    }
}
