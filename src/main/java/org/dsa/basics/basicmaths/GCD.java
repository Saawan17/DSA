package org.dsa.basics.basicmaths;

public class GCD {
    static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
    }

    // Recursive method
    static int gcdRec(int a, int b) {
        if (b == 0)
            return a;
        return gcdRec(b, a % b);
    }


    public static void main(String[] args) {
        System.out.println(gcdRec(9, 12));
    }
}
