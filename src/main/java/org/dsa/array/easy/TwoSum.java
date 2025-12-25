package org.dsa.array.easy;


import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};  // {-7,-3,1,3,6}
        int k = 61;

        // Create Solution object
        TwoSum sol = new TwoSum();

        // Function call to find the result
        String ans = sol.twoSumOptimal(nums, k);

        // Output the result
        System.out.println("Two Sum is: " + ans);
    }

    // Brute Force
    public String twoSum(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    // Optimal Approach
    public String twoSumOptimal(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        int sum = 0;
        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum < k) {
                left++;
                sum = 0;
            } else if (sum > k) {
                right--;
                sum = 0;
            } else if (sum == k)
                return "YES";
        }
        return "NO";
    }


}
