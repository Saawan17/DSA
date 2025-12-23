package org.dsa.array.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(moveZerosToEnd(arr)));
        moveZeros(arr);
    }

    // Brute Force Method
    // TC: O(N)
    // SC: O(N)
    public static int[] moveZerosToEnd(int[] arr) {
        int temp[] = new int[arr.length];
        int index = 0;

        if (arr.length == 0)
            return arr;

        for (int i = 0; i < temp.length; i++) {
            if (arr[i] != 0) {
                temp[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        return arr;
    }

    // Optimal Solution
    // TC: O(N)
    // SC: O(1)
    public static void moveZeros(int arr[]) {
        int j = -1;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == 0)
                j = k;
        }

        if (j == -1) return;

        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
