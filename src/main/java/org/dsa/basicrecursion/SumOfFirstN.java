package org.dsa.basicrecursion;

public class SumOfFirstN {
    // Parametrised way
    static void sum(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }

        sum(n - 1, sum + n);

    }

    static int sumFunction(int n) {
        if (n == 0)
            return 0;

        return n + sumFunction(n - 1);
    }


    public static void main(String[] args) {
        sum(10, 0);
        System.out.println(sumFunction(10));
    }
}
