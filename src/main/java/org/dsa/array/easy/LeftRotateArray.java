package org.dsa.array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {

    // TC: O(N)
    // SC: O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(leftRotate(arr)));
    }

    private static int[] leftRotate(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i]; // 0 --> 2, 1 --> 3, 2 --> 4, 3 --> 5
         }
        arr[arr.length - 1] = temp;
        return arr;
    }
}
