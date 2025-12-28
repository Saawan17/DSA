package org.dsa.basics.hashing;

import java.util.Scanner;

public class HashingNum {
    public static void main(String[] args) {
        System.out.print("Enter the array size:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Declare hash
        // Precompute
        int[] hash = new int[13];
        System.out.println(hash.length);
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q = sc.nextInt();
        while (q != 0) {
            int number = sc.nextInt();

            //Fetch
            System.out.println(number +":"+hash[number]);
            q--;
        }
    }
}
