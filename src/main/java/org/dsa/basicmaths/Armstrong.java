package org.dsa.basicmaths;

public class Armstrong {
    public static void main(String[] args) {
        int n = 371;
        int arm = n;
        int dup = 0;
        int power = String.valueOf(n).length();
        while (n > 0) {
            int rem = n % 10;
            dup += (int) Math.pow(rem, power);
            n = n / 10;
        }
        if (dup == arm)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
