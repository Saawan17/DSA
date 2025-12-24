package org.dsa.array.easy;

import java.util.Scanner;

public class CountMaxConsecutiveOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(consecutiveOnes(arr));
    }

//    public static int consecutiveOnes(int[] arr) {
//        int max = 0, count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                count++;
//                continue;
//            } else if (count > max) {
//                max = count;
//                count = 0;
//            }
//        }
//        return max;
//    }

    public static int consecutiveOnes(int[] arr) {
        int max = 0, count = 0;

        for (int num : arr) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

}
