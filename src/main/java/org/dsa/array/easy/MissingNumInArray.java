package org.dsa.array.easy;

import java.util.Scanner;

public class MissingNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing element is: " + missingElement(arr, n));
    }

    public static int missingElement(int[] arr, int N) {
        if (arr.length == 0)
            return -1;

        // Calculate the sum of first N natural numbers
        int sum = (N * (N + 1)) / 2;

        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return sum - actualSum;
    }
}
