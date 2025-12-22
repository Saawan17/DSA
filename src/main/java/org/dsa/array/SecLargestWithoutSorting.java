package org.dsa.array;

import java.util.Scanner;

public class SecLargestWithoutSorting {
    public static int secondLargestElement(int[] nums) {
        int large = Integer.MIN_VALUE;
        int sec_large = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > large) {
                sec_large = large;
                large = nums[i];
            } else if (nums[i] > sec_large && nums[i] != large) {
                sec_large = nums[i];
            }
        }

        return sec_large;

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
        System.out.println(secondLargestElement(arr));
    }
}
