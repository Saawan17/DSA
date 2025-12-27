package org.dsa.basicrecursion;

public class Palindrome {
    static boolean plaindrome(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - i - 1))
                return false;
        }
        return true;
    }
    // Function to check if a string is a palindrome using recursion
     static boolean palindrome(int i, String s) {
        // Base Condition: If i exceeds half of the string, all the elements have been compared
        // and the string is a palindrome, return true.
        if (i >= s.length() / 2) return true;

        // If the start and end characters are not equal, it's not a palindrome.
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        // If both characters are the same, increment i and check start+1 and end-1.
        return palindrome(i + 1, s);
    }


    public static void main(String[] args) {
        String palin = "Nitin";
        if (plaindrome(palin.toLowerCase()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        System.out.println(palindrome(0, palin));

    }
}
