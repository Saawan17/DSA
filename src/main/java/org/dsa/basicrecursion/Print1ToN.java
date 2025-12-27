package org.dsa.basicrecursion;

public class Print1ToN {
    static void fun(int current, int n) {
        if (current > n)
            return;
        System.out.println(current);
        current++;
        fun(current, n);

    }

    public static void main(String[] args) {

        int n = 10;
        fun(1, n);
    }
}
