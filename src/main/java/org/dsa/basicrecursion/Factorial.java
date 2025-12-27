package org.dsa.basicrecursion;

public class Factorial {
    static int fact(int n, int factValue) {
        if (n == 0)
            return factValue;

        return fact(n - 1, factValue * n);
    }

    static int anotherWay(int n) {
        if (n == 0)
            return 1;

        return n * anotherWay(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(4, 1));
        System.out.println(anotherWay(4));
    }
}
