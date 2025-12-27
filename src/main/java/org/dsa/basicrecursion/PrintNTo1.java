package org.dsa.basicrecursion;

public class PrintNTo1 {
    public static void fun(int current, int n) {
        if (current > n)
            return;
//        System.out.println(n);
//        fun(n - 1);


        // Recursive call with next number
        fun(current + 1, n);

        // Print current number during backtracking
        System.out.print(current + " ");
    }

    public static void main(String[] args) {
        int n = 10;
        fun(1, n);
    }
}
