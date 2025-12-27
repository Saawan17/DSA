package org.dsa.basicmaths;

public class Palindrome {
    public static void main(String[] args) {
        int n = 13231;
        int original = n;
        int palin = 0;
        while (n > 0) {
            int rem = n % 10;
            palin = palin * 10 + rem;
            n = n / 10;
        }
        if (original == palin)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
