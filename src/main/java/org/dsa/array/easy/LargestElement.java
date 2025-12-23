package org.dsa.array.easy;

import java.util.Scanner;

public class LargestElement {
    public static int largestElement(int[] nums) {
        int large = nums[0];
        for (int i = 1; i < nums.length; i++) {
                if (large < nums[i]) {
                    large = nums[i];
                }
        }
        return large;
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
        System.out.println(largestElement(arr));
    }
}
