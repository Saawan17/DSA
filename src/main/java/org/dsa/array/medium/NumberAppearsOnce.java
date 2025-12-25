package org.dsa.array.medium;

import java.util.Scanner;

public class NumberAppearsOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(appearsOnce(arr));
    }

    public static int appearsOnce(int[] arr) {
        int xorr = 0;
        for(int i: arr)
            xorr = xorr ^ i;

        return xorr;
    }
}
