package org.dsa.basicrecursion;

public class Fibonacci {
    static int fibo(int n) {
        if (n <= 1)
            return n;

        int last = fibo(n - 1);
        int secLast = fibo(n - 2);

        return last + secLast;
    }


    public static void main(String[] args) {
        int n = 3;
        // If n is 0, print only the first term
        if (n == 0) {
            System.out.println("The Fibonacci Series up to " + n + "th term:");
            System.out.println(0);
        } else {
            int secondLast = 0; // (i-2)th term
            int last = 1;       // (i-1)th term

            System.out.println("The Fibonacci Series up to " + n + "th term:");
            System.out.print(secondLast + " " + last + " ");

            int cur;
            for (int i = 2; i <= n; i++) {
                cur = last + secondLast;  // Calculate current term
                secondLast = last;        // Slide the window
                last = cur;
                System.out.print(cur + " ");
            }
            System.out.println();
        }

        int i = fibo(n);
        System.out.println(i);
    }
}
